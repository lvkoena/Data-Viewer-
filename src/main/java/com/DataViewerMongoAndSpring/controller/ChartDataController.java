package com.DataViewerMongoAndSpring.controller;

import com.DataViewerMongoAndSpring.model.ChartData;
import com.DataViewerMongoAndSpring.service.ChartDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chartdata")
public class ChartDataController {

    @Autowired
    private ChartDataService chartDataService;

    @PostMapping("/save")
    public String saveChartData(@RequestBody List<ChartData> chartDataList) {
        chartDataService.saveChartData(chartDataList);
        return "Chart data saved successfully!";
    }

    @GetMapping("/all")
    public List<ChartData> getAllChartData() {
        return chartDataService.findAll();
    }
}
