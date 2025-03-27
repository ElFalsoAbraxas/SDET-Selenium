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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.utilities.DriverHandler.driver;

public class TestCase2 {

    public static String description;

    public TestCase2(String description) {
        this.description = description;
    }

    public static void Execute(Browser browser, String URL) throws InterruptedException {
        ExtentReport.test = ExtentReport.extent.createTest(description);
        ExtentReport.test.log(Status.INFO, "Starting Test Case 2");


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
        System.out.println("Step 2 click Log in button");
        System.out.println("*******************");
        Execute.Action(Action.click, methods.clickLogin(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 3 fill form pt1 ");
        System.out.println("*******************");

        if(methods.clickPopUp().isDisplayed()){
            Execute.Action(Action.implicitWait, null, "7");
            Execute.Action(Action.click, methods.clickPopUp(),"");

        }
        Execute.Action(Action.type, methods.typeFirstName(), "Omar");
        Execute.Action(Action.type, methods.typeMiddleName(), "Alejandro");
        Execute.Action(Action.type, methods.typeLastName(), "Abasta");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)", "");
        Execute.Action(Action.click, methods.clickMM(), "");
        js.executeScript("window.scrollBy(0,310)", "");
        Execute.Action(Action.click, methods.selectMM(), "");
        js.executeScript("window.scrollBy(0,-250)", "");
        Execute.Action(Action.click, methods.clickDD(), "");
        js.executeScript("window.scrollBy(0,200)", "");
        Execute.Action(Action.click, methods.selectDD(), "");
        js.executeScript("window.scrollBy(0,-200)", "");
        Execute.Action(Action.click, methods.clickYYYY(), "");
        js.executeScript("window.scrollBy(0,250)", "");
        Execute.Action(Action.click, methods.selectYYYY(), "");
        Execute.Action(Action.implicitWait, null,"7");
        js.executeScript("window.scrollBy(0,-200)", "");
        Execute.Action(Action.click, methods.clickGender(), "");
        Execute.Action(Action.click, methods.selectGender(), "");
        Execute.Action(Action.click, methods.clickNextSection1(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 4 fill form pt2 ");
        System.out.println("*******************");
        Execute.Action(Action.click, methods.clickCountry(), "");
        Execute.Action(Action.click, methods.selectCountry(), "");
        Execute.Action(Action.type, methods.clickTypeAddress(), "pto mazatlan 217");
        Execute.Action(Action.type, methods.clickTypeCity(), "Saltillo");
        Execute.Action(Action.click, methods.clickTypeState(),"");
        Execute.Action(Action.click, methods.selectState(),"");
        Execute.Action(Action.type, methods.clickTypePostalCode(), "25160");
        Execute.Action(Action.type, methods.clickTypeAreaCode(), "8441234567");
        Execute.Action(Action.type, methods.clickTypeEmailAddress(), "dummie@outlook.com");
        Execute.Action(Action.type, methods.clickTypeConfirmEmail(), "dummie@outlook.com");
        js.executeScript("window.scrollBy(0,350)", "");
        Execute.Action(Action.click, methods.clickNextSection2(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 5 fill form pt3 ");
        System.out.println("*******************");
        js.executeScript("window.scrollBy(0,250)", "");
        Execute.Action(Action.type, methods.clickTypeUsername(), "AbastaLuc");
        //No le gusta el username
        Execute.Action(Action.type, methods.clickTypePassword(), "Password123");
        Execute.Action(Action.type, methods.clickTypeConfirmPassword(), "Password123");
        js.executeScript("window.scrollBy(0,250)", "");
        Execute.Action(Action.click, methods.clickSubmitFORM(), "");
        Execute.Action(Action.isDisplayed, methods.validateSuccessMessage(),"");
        Execute.Action(Action.click, methods.okFinishButton(), "");
        Execute.Action(Action.implicitWait, null, "7");
        System.out.println("*******************");
        System.out.println("Step 6 quit");
        System.out.println("*******************");
        Execute.Action(Action.implicitWait, null, "10");
        Execute.Action(Action.quit, null, "");

        Print.TestCaseEnd(description);

        ExtentReport.test.log(Status.INFO, "Test 2 Completed");

    }
}
