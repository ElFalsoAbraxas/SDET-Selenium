package org.example.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverHandler {
    public static WebDriver driver;

    public static void Start(Browser browserName) {

        switch (browserName) {
            case Chrome:
                try {
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Omar Abasta\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
                    driver = new ChromeDriver();
                    System.out.println("===========> Chrome Succesfully Initiaded <============");
                } catch (Exception e) {
                    System.out.println("===========> Chrome Usuccesfully Initiaded <============" + e.getMessage());
                }
                break;
            case InternetExplorer:
                try {
                    System.setProperty("webdriver.ie.driver", "C:\\Temp\\JavaCABuild\\Drivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    System.out.println("===========> IE Succesfully Initiaded <============");
                } catch (Exception e) {
                    System.out.println("===========> IE Usuccesfully Initiaded <============" + e.getMessage());
                }
                break;
            case FireFox:
                try {
                    System.setProperty("webdriver.gecko.driver", "C:\\Temp\\JavaCABuild\\Drivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    System.out.println("===========> FF Succesfully Initiaded <============");
                } catch (Exception e) {
                    System.out.println("===========> FF Usuccesfully Initiaded <============" + e.getMessage());
                }
                break;
            default:
                try {
                    System.setProperty("webdriver.chrome.driver", "C:\\Temp\\JavaCABuild\\Drivers\\chromedriver.exe");
                    driver = new ChromeDriver();
                    System.out.println("===========> Chrome Succesfully Initiaded <============");
                } catch (Exception e) {
                    System.out.println("===========> Chrome Usuccesfully Initiaded <============" + e.getMessage());
                }
                break;

        }

    }

    public DriverHandler() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\JavaCABuild\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}