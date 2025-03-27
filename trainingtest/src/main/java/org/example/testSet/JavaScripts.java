package org.example.testSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScripts {
    WebDriver driver;

    public JavaScripts(WebDriver driver) {
        this.driver = driver;
    }

    public void Higilight(WebElement element){
        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Change the style of the element to highlight it
        js.executeScript("arguments[0].style.border='3px solid red'", element);

        // Optionally, you can add a delay to see the highlight effect
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].style.border=''", element);

    }



}
