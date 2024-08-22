package com.DataViewerMongoAndSpring.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class User {
    @Id
    private String id;
    private String name;
    private String email;
}

class PieChartData {
    private String name;
    private int value;
}
