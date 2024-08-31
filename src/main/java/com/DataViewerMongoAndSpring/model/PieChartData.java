package com.DataViewerMongoAndSpring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PieChartData {

    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private int value;

    @JsonProperty("year")
    private int year;

    public PieChartData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public PieChartData(String name, int value, int year) {
        this.name = name;
        this.value = value;
        this.year = year;
    }

    public PieChartData() {
    }
}
