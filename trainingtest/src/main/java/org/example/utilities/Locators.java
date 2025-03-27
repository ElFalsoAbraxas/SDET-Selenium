package org.example.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static WebElement element;
    WebDriver driver;

    public Locators(LocatorType locatorType, String locator) {
        this.driver = DriverHandler.driver;
        if (driver != null) {
            switch (locatorType) {
                case id:
                    element = driver.findElement(By.id(locator));
                    break;
                case xpath:
                    element = driver.findElement(By.xpath(locator));
                    break;
                case cssSelector:
                    element = driver.findElement(By.cssSelector(locator));
                    break;
                case name:
                    element = driver.findElement(By.name(locator));
                    break;

            }
        } else {
            System.out.println("=============>Driver was not succesfully initiaded, skipping step.<=============");
        }

    }
}