package com.DataViewerMongoAndSpring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StackedLineData {
    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private int value;

    @JsonProperty("year")
    private int year;
}

