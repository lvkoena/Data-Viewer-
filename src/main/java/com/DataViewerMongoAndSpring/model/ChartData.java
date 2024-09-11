package com.DataViewerMongoAndSpring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "chartData")
public class ChartData {

    @Id
    private String id;
    private String name;
    private String type;
    private String stack;
    private int[] data;

    public ChartData(String name, String type, String stack, int[] data) {
        this.name = name;
        this.type = type;
        this.stack = stack;
        this.data = data;
    }

    public ChartData() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}
