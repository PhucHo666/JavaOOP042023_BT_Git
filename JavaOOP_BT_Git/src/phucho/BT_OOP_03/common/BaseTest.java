package phucho.BT_OOP_03.common;

public class BaseTest extends Constants {

    public BaseTest(String browser) {
        super(browser);
    }

    public void createDriver(){
        System.out.println("Open Browser: " + getBrowser());
        System.out.println("Open Report: " + isReport());
        System.out.println("Headless mode: " + isHeadless());
    }

    public void closeDriver(){
        System.out.println("Close browser: " + getBrowser());
    }

    public void closeDriver(String browser){
        //Constants constants = new Constants("Chrome");
        System.out.println("Close browser: " + getBrowser());
    }


    }

