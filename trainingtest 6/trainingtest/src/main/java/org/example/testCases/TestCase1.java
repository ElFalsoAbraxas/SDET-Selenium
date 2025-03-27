package org.example.testCases;

import com.aventstack.extentreports.Status;
import com.opencsv.bean.CsvToBeanBuilder;
import org.checkerframework.checker.units.qual.A;
import org.example.methods.Methods;
import org.example.reports.ExtentReport;
import org.example.testSet.Flight;
import org.example.utilities.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static org.example.utilities.DriverHandler.driver;

public class TestCase1 {

    public static String description;

    public TestCase1(String description) {
        this.description = description;
    }

    public static void Execute(Browser browser, String URL) throws InterruptedException, IOException {
        ExtentReport.test = ExtentReport.extent.createTest(description);
        ExtentReport.test.log(Status.INFO, "Starting Test Case 1");
        TakeSS ss = new TakeSS(DriverHandler.driver);

        String filePath = "C:\\Users\\Omar Abasta\\Documents\\Flights.csv";
        List<Flight> flightList = new CsvToBeanBuilder(new FileReader(filePath))
                .withType(Flight.class).build().parse();


        Print.TestCaseStart(description);
        Methods methods = new Methods();
        DriverHandler.Start(browser);

        System.out.println("*******************");
        System.out.println("Step 1 Start automation go to WEBSITE");
        System.out.println("*******************");
        Execute.Action(Action.maximizeWindow, null, "");
        Execute.Action(Action.navigate, null, URL,true);
        Execute.Action(Action.implicitWait, null, "5");
        for (Flight flight: flightList) {
            System.out.println(flight);
            System.out.println("*******************");
            System.out.println("Step 2 click and type FROM ");
            System.out.println("*******************");
            Execute.Action(Action.click, methods.fromOption(), "", true);
            Execute.Action(Action.implicitWait, null, "15");
            Execute.Action(Action.clearTxt, methods.fromToInput(),"", true);
            Execute.Action(Action.type, methods.fromToInput(),flight.getFrom() );
            Execute.Action(Action.click, methods.fromClose(), "",true);
            Execute.Action(Action.implicitWait, null, "7");
            System.out.println("*******************");
            System.out.println("Step 3 click and type TO ");
            System.out.println("*******************");
            Execute.Action(Action.click, methods.toOption(), "",true);
            Execute.Action(Action.clearTxt, methods.toOption(),"",true);
            Execute.Action(Action.type, methods.fromToInput(), flight.getTo());
            Execute.Action(Action.click, methods.fromClose(), "");
            Execute.Action(Action.implicitWait, null, "7");
            System.out.println("*******************");
            System.out.println("Step 4 click and select TYPE ");
            System.out.println("*******************");
            Execute.Action(Action.click, methods.typeOption(), "");
            Execute.Action(Action.click, methods.selectTypeOption(flight.getType()),flight.getType());
            Execute.Action(Action.implicitWait, null, "7");
            if(Objects.equals(flight.getType(), "Round Trip")) {
                System.out.println("*******************");
                System.out.println("Step 5 click and select DEPARTURE DATE ");
                System.out.println("*******************");
                Execute.Action(Action.click, methods.departureClick(), "");
                Execute.Action(Action.click, methods.clickClearDatesButton(),"");
                Execute.Action(Action.click, methods.departureSelect(flight.getDepartD()), flight.getDepartD());
                Execute.Action(Action.implicitWait, null, "5");
                System.out.println("*******************");
                System.out.println("Step 6 click and select RETURN DATE ");
                System.out.println("*******************");
                Execute.Action(Action.click, methods.departureSelect(flight.getReturnD()), flight.getReturnD());
                Execute.Action(Action.click, methods.clickDoneDates(), "");
                Execute.Action(Action.implicitWait, null, "5");
            }else{
                System.out.println("*******************");
                System.out.println("Step 5 click and select DEPARTURE DATE ");
                System.out.println("*******************");
                Execute.Action(Action.click, methods.departureClick(), "");
                Execute.Action(Action.click, methods.clickClearDatesButton(),"");
                Execute.Action(Action.click, methods.departureSelect(flight.getDepartD()), flight.getDepartD());
                Execute.Action(Action.implicitWait, null, "5");
            }
            System.out.println("*******************");
            System.out.println("Step 7 click and select Number of PASSENGERS ");
            System.out.println("*******************");
            Execute.Action(Action.click, methods.passengersClick(), "");
            Execute.Action(Action.click, methods.passengersSelect(flight.getPassengers()), flight.getPassengers());
            //Execute.Action(Action.selectByText,methods.passengersSelect(flight.getPassengers()),flight.getPassengers());
            Execute.Action(Action.implicitWait, null, "5");
            ExtentReport.test.log(Status.INFO, "-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        System.out.println("*******************");
        System.out.println("Step 8 click on SEARCH button and quit ");
        System.out.println("*******************");
        Execute.Action(Action.click, methods.submitFlightButton(), "");
        Execute.Action(Action.implicitWait, null, "10");
        Execute.Action(Action.quit, null, "");

        Print.TestCaseEnd(description);

        ExtentReport.test.log(Status.INFO, "Test 1 Completed");

    }
}
