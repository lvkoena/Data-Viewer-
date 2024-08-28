package com.DataViewerMongoAndSpring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PieChartData {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private int value;

    @JsonProperty("year")
    private int year;

    // Constructor to initialize name and value
    public PieChartData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public PieChartData(String name, int value, int year) {
        this.name = name;
        this.value = value;
        this.year = year;
    }

    // Default constructor
    public PieChartData() {
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
