package org.example.testSet;

import com.opencsv.bean.CsvBindByName;

import java.util.Date;

public class Flight {
    @CsvBindByName
    private String from;
    @CsvBindByName
    private String to;
    @CsvBindByName
    private String type;
    @CsvBindByName
    private String departD;
    @CsvBindByName
    private String returnD;
    @CsvBindByName
    private String passengers;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepartD() {
        return departD;
    }

    public void setDepartD(String departD) {
        this.departD = departD;
    }

    public String getReturnD() {
        return returnD;
    }

    public void setReturnD(String returnD) {
        this.returnD = returnD;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", type='" + type + '\'' +
                ", departD=" + departD +
                ", returnD=" + returnD +
                ", passengers=" + passengers +
                '}';
    }
}
