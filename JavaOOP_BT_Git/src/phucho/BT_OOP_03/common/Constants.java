package phucho.BT_OOP_03.common;

public class Constants {
    public static String browser = "Chrome";
    public static Boolean report = true;

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static Boolean headless = false;

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
