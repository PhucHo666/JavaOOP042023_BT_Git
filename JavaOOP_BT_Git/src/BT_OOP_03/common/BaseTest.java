package BT_OOP_03.common;

public class BaseTest extends Constants {

    public BaseTest(String browser) {
        super(browser);
    }

    public void createDriver(){
        System.out.println("Browser: " + getBrowser());
        System.out.println("Report: " + isReport());
        System.out.println("Headless: " + isHeadless());
    }

    public void closeDriver(){
        Constants constants = new Constants("Chrome");
        System.out.println("Close browser" + browser);
    }
}
