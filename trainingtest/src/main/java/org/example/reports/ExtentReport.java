package org.example.reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {
    public static ExtentTest test;
    public static ExtentReports extent;
    


    public static void InitReport() {
        String screenshotPath = "";

        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("Reports.html");
        extent.attachReporter(spark);

        test = extent.createTest("ExtentDemo");

    }

    public static void generateReport() {
        extent.flush();
    }
}
