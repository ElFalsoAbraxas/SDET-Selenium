package org.example.testCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.Status;
import org.example.methods.Methods;
import org.example.reports.ExtentReport;
import org.example.utilities.Action;
import org.example.utilities.Browser;
import org.example.utilities.DriverHandler;
import org.example.utilities.EmailTest;
import org.example.utilities.Execute;
import org.example.utilities.Print;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static org.example.utilities.DriverHandler.driver;

public class TestCase3 {

    public static String description;

    public TestCase3(String description) {
        this.description = description;
    }

    public static void Execute(Browser browser, String URL) throws InterruptedException {
        ExtentReport.test = ExtentReport.extent.createTest(description);
        ExtentReport.test.log(Status.INFO, "Starting Test Case 3");

        Print.TestCaseStart(description);
        Methods methods = new Methods();
        DriverHandler.Start(browser);
        System.out.println("*******************");
        System.out.println("Step 1 Start automation go to WEBSITE");
        System.out.println("*******************");
        Execute.Action(Action.maximizeWindow, null, "");
        Execute.Action(Action.navigate, null, URL);
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 2 click search Icon ");
        System.out.println("*******************");
        Execute.Action(Action.click, methods.clickSearchIcon(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 3 type topic ");
        System.out.println("*******************");
        Execute.Action(Action.type, methods.clickTypeSearchInput(), "Help Center");
        methods.fromToInput().sendKeys(Keys.RETURN);
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 4 verify text topic ");
        System.out.println("*******************");
        driver.navigate().refresh();
        Execute.Action(Action.isDisplayed, methods.verifyTextTopic(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 5 click help center overview ");
        System.out.println("*******************");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Execute.Action(Action.click, methods.clickHelpCO(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 6 verify Title ");
        System.out.println("*******************");
        Execute.Action(Action.isDisplayed, methods.verifyTitle(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 7 quit ");
        System.out.println("*******************");
        Execute.Action(Action.implicitWait, null, "10");
        Execute.Action(Action.quit, null, "");

        Print.TestCaseEnd(description);

        ExtentReport.test.log(Status.INFO, "Test 3 Completed");

    }
}