package org.example.testSet;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import org.example.testCases.TestCase1;
import org.example.testCases.TestCase2;
import org.example.testCases.TestCase3;
import org.example.reports.ExtentReport;
import org.example.utilities.Action;
import org.example.utilities.Browser;
import org.example.utilities.DriverHandler;
import org.example.utilities.Execute;
import org.example.utilities.ReaderCSV;

public class TestSet {
    public static String URL;

    public static void main(String[] args) throws InterruptedException, IOException {

        ExtentReport.InitReport();
        URL = "https://www.delta.com/us/en";

       // TestCase1.description = "Test Case 1";
      // TestCase1.Execute(Browser.Chrome, URL);

       TestCase2.description = "Test Case 2";
        TestCase2.Execute(Browser.Chrome, URL);

      //  TestCase3.description = "Test Case 3";
     //   TestCase3.Execute(Browser.Chrome, URL);


        ExtentReport.generateReport();


    }
}
