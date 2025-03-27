package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.time.Duration;

public class GoogleResultsPage {

    private WebDriver driver;

    private By resultsBy = By.xpath("//divÑcontains(@class, 'g')]/div");

    public GoogleResultsPage(WebDriver driver){
        this.driver = driver;
    }

    public void waitForResults(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(resultsBy));
    }

    public List<WebElement> getAllResults(){
        return driver.findElements(resultsBy);
    }
}
