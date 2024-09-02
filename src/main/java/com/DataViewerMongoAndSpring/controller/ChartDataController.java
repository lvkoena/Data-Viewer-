package com.DataViewerMongoAndSpring.controller;

import com.DataViewerMongoAndSpring.model.ChartData;
import com.DataViewerMongoAndSpring.service.ChartDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chartdata")
public class ChartDataController {

    @Autowired
    private ChartDataService chartDataService;

    @PostMapping("/save")
    public String saveChartData() {
        List<ChartData> chartDataList = new ArrayList<>();

        // Sample data to be pushed to MongoDB
        chartDataList.add(new ChartData("Java", "line", "Total", new int[]{120, 132, 101, 134, 90, 230, 210}));
        chartDataList.add(new ChartData("Python", "line", "Total", new int[]{220, 182, 191, 234, 290, 330, 310}));
        chartDataList.add(new ChartData("C#", "line", "Total", new int[]{150, 232, 201, 154, 190, 330, 410}));
        chartDataList.add(new ChartData("NodeJS", "line", "Total", new int[]{320, 332, 301, 334, 390, 330, 320}));
        chartDataList.add(new ChartData("Typescript", "line", "Total", new int[]{820, 932, 901, 934, 1290, 1330, 1320}));

        chartDataService.saveChartData(chartDataList);
        return "Chart data saved successfully!";
    }
}
