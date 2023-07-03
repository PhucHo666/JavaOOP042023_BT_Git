package phucho.BT_OOP_03.testcases;

import phucho.BT_OOP_03.common.BaseTest;
import phucho.BT_OOP_03.common.Constants;

public class TestCases extends BaseTest {


    public TestCases() {
        super(browser);
    }

    public void loginCMS(){
        Constants.setBrowser("Firefox");
        createDriver();
        System.out.println("Navigate to URL https://cms.anhtester.com/login ");
        System.out.println("Enter email and password ");
        System.out.println("Click on Login button ");
        System.out.println("Verify redirect to Admin page");
        closeDriver();
    }

    public void addCategoryCMS(){
        createDriver();
        System.out.println("navigate to url https://cms.anhtester.com/login ");
        System.out.println("Enter email and password ");
        System.out.println("Click on Login button ");
        System.out.println("Verify redirect to Admin page");

        System.out.println("Click on the Products menu");
        System.out.println("Click on the Category menu");
        System.out.println("Click on Add New Category button");
        System.out.println("Enter all fields on the form create new category");
        System.out.println("Click on Save button");
        System.out.println("Verify add New Category successfully");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.loginCMS();
        System.out.println("================================");
        testCases.addCategoryCMS();


    }
}
