package com.DataViewerMongoAndSpring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PieChartData {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private int value;

    @JsonProperty
    private int year;

    // Constructor to initialize name and value
    public PieChartData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Default constructor
    public PieChartData() {
    }
}
