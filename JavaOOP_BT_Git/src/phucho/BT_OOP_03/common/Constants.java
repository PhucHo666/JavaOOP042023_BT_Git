package phucho.BT_OOP_03.common;

public class Constants {
    static String browser = "Chrome";
    static boolean report;

    static boolean headless;

    public Constants(String browser){
        Constants.browser = browser;

    }

    public static String getBrowser() {
        return browser;
    }

    public static boolean isReport() {
        return report;
    }



    public static boolean isHeadless() {
        return headless;
    }
}
