package org.example;

import org.example.pages.GoogleHomePage;
import org.example.pages.GoogleResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class AppTest{

    public WebDriver driver;

    @BeforeSuite
    public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }


     @AfterSuite
    public void cleanUp(){
        driver.quit();
     }

     @Test(priority = 1)
    public void test(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.goToHome();
        googleHomePage.searchText("Linux");
        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
        googleResultsPage.waitForResults();
        List<WebElement> results = googleResultsPage.getAllResults();
        for(WebElement result : results){
            System.out.println(result.getText());
        }
     }

     @Test(priority = 2)
     public void test2(){
         GoogleHomePage googleHomePage = new GoogleHomePage(driver);
         googleHomePage.goToHome();
         googleHomePage.searchText("Linux");
         GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver);
         googleResultsPage.waitForResults();
         List<WebElement> results = googleResultsPage.getAllResults();
         for(WebElement result : results){
             System.out.println(result.getText());
         }
     }

}
