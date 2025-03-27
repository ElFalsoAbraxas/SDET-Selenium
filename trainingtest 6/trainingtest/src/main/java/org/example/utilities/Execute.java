package org.example.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import org.apache.commons.io.FileUtils;
import org.example.testSet.JavaScripts;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.example.reports.ExtentReport;


public class Execute {

    public static String text;
    public static String newText;
    public static double newTextDouble;
    public static String attribute;
    public static boolean visible;
    public static Select cmb;

   public  static void Action(Action action, WebElement element, String value) {
       Action(action,element,value,false);
   }
    public static void Action(Action action, WebElement element, String value, boolean includeSS) {
        WebDriver driver = DriverHandler.driver;
        JavaScripts js = new JavaScripts(driver);


        if (driver != null) {
            switch (action) {
                case click:
                    try {
                        js.Higilight(element);
                        element.click();
                        ExtentReport.test.pass("=============>Succesfully clicked<=============",CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully clicked<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case type:
                    try {
                        element.sendKeys(value);
                        js.Higilight(element);
                        ExtentReport.test.pass("Succesfully Typed: " + value,CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully Typed: " + value + "<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case navigate:
                    try {
                        driver.navigate().to(value);
                        ExtentReport.test.pass("Succesfully Navigated to: " + value,CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully Navigated to: " + value + "<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed Navigated: " + e.getMessage() + "<=============");
                    }
                    break;
                case implicitWait:
                    try {
                        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(value)));
                        ExtentReport.test.pass("=============>Succesfully wait<=============");
                        System.out.println("=============>Succesfully Waited for: " + value + " seconds<=============");
                    } catch (NumberFormatException e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case explicitWait:
                    try {
                        ExecuteExplicitWait(action, element, value, value, 0);
                        System.out.println("=============>Succesfully Waited for: " + value + " seconds<=============");
                    } catch (NumberFormatException e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case quit:
                    try {
                        driver.quit();
                        driver = null;
                        ExtentReport.test.pass("Succesfully Closed");
                        System.out.println("=============>Succesfully Closed<=============");
                    } catch (Exception e) {
                        driver = null;
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;

                case getAttribute:
                    try {
                        attribute = element.getAttribute(value);
                        ExtentReport.test.pass("Succesfully getAttribute",CreateSS(includeSS,driver));
                        System.out.println(attribute);
                        System.out.println("=============>Succesfully getAttribute<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;

                case moveTo:
                    try {
                        Actions move = new Actions(driver);
                        move.moveToElement(element).build().perform();
                        ExtentReport.test.pass("Succesfully Moved to",CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully Moved<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case getText:
                    try {
                        text = element.getText();
                        ExtentReport.test.pass("Succesfully getText: " + text,CreateSS(includeSS,driver));
                        System.out.println(text);
                        System.out.println("=============>Succesfully getText: " + text + "<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case modifyText:
                    try {
                        String newText = value.replace("$", "");
                        newTextDouble = Double.parseDouble(newText);
                        ExtentReport.test.pass("Succesfully Modified",CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully Modified<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case clearTxt:
                    try {
                        js.Higilight(element);
                        element.clear();
                        ExtentReport.test.pass("TextBox Succesfully Cleared",CreateSS(includeSS,driver));
                       System.out.println("=============>Succesfully Clear<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;

                case isDisplayed:
                    try {
                        js.Higilight(element);
                        visible = element.isDisplayed();
                        System.out.println(visible);
                        ExtentReport.test.pass("Successfully Displayed",CreateSS(includeSS,driver));
                        System.out.println("=============>Successfully Displayed<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case selectByValue:
                    try {
                        cmb = new Select(element);
                        cmb.selectByValue(value);
                        ExtentReport.test.pass("Successfully Selected: " + value,CreateSS(includeSS,driver));
                        System.out.println("=============>Successfully Selected<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case selectByText:
                    try {
                        cmb = new Select(element);
                        cmb.selectByVisibleText(value);
                        ExtentReport.test.pass("Succesfully Selected: " + value,CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully Selected<=============");
                    } catch (Exception e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;


                case maximizeWindow:
                    try {
                        driver.manage().window().maximize();
                     //   File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                     //   String screenshotPath = value;
                      //  FileUtils.copyFile(screenshot, new File(screenshotPath));
                       ExtentReport.test.pass("Windows Succesfully Maximized",
                               CreateSS(includeSS,driver));
                        System.out.println("=============>Succesfully Maximized<=============");
                    } catch (NumberFormatException e) {
                        ExtentReport.test.fail(e.getMessage());
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
            }

        } else {
            System.out.println("=============>Driver was not succesfully initiaded, skipping step.<=============");
        }
    }

    private static Media CreateSS(Boolean includeSS, WebDriver driver){
        Media media = null;
        try {
            if(includeSS) {
                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                UUID uuid = UUID.randomUUID();
                String screenshotPath = uuid.toString() + ".png";
                FileUtils.copyFile(screenshot, new File(screenshotPath));
               media = MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return media;

    }

    public static void ExecuteExplicitWait(Action wait, WebElement element, String attribute, String value, int i) {
        WebDriver driver = DriverHandler.driver;

      /*  WebDriverWait ewait = new WebDriverWait(driver, i);

        if (driver != null) {
            switch (wait) {
                case attributeContains:
                    try {
                        ewait.until(ExpectedConditions.attributeContains(element, attribute, value));
                        System.out.println("=============>Succesfully ExplicitWait<=============");
                    } catch (Exception e) {
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
                case attributeToBe:
                    try {
                        ewait.until(ExpectedConditions.attributeToBe(element, attribute, value));
                        System.out.println("=============>Succesfully ExplicitWait<=============");
                    } catch (Exception e) {
                        System.out.println("=============>Failed: 05 " + e.getMessage() + "<=============");
                    }
                    break;
                case changeText:
                    try {
                        ewait.until(ExpectedConditions.textToBePresentInElement(element, value));
                        System.out.println("=============>Succesfully ExplicitWait<=============");
                    } catch (Exception e) {
                        System.out.println("=============>Failed: " + e.getMessage() + "<=============");
                    }
                    break;
            }

        } else {
            System.out.println("=============>Driver was not succesfully initiaded, skipping step.<=============");
        }


       */
    }

}
