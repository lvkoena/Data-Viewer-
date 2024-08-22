package com.DataViewerMongoAndSpring.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Setter
@Getter
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private List<PieChartData> chartData;
}

class PieChartData {
    private String name;
    private int value;
}
