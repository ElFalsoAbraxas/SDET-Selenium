package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleHomePage {
    private WebDriver driver;

    private By inputBy = By.name("q");
    private By searchBtnBy = By.name("btnK");


    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getInput(){
        return driver.findElement(inputBy);
    }

    public WebElement getSearchBtn(){
        return driver.findElement(searchBtnBy);
    }

    public void goToHome(){
        driver.get("https://www.google.com");
    }

    public void searchText(String text){
        getInput().sendKeys(text);
        getInput().sendKeys(Keys.ENTER);
    }
}
