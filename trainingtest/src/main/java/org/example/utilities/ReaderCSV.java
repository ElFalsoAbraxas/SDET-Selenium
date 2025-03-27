package org.example.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

import org.example.testCases.TestCase1;
import org.example.testSet.TestSet;
import org.example.utilities.Browser;

public class ReaderCSV {
    public static String from;
    public static String to;
    public static String type;
    public static String departureDate;
    public static String returnDate;
    public static String passengers;

    public static void location(String location) throws FileNotFoundException {
        CSVReader reader = new CSVReader(new FileReader(location));

        try {
            String[] fila = null;
            fila = reader.readNext();
            fila = reader.readNext();

            from = fila[0];
            to = fila[1];
            type = fila[2];
            departureDate = fila[3];
            returnDate = fila[4];
            passengers = fila[5];


            System.out.println("from: " + from);
            System.out.println("to: " + to);
            System.out.println("type: " + type);
            System.out.println("departureD: " + departureDate);
            System.out.println("returnD: " + returnDate);
            System.out.println("passengers" + passengers);

            reader.close();
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
