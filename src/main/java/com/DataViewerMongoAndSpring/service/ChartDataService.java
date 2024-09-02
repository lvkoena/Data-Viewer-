package com.DataViewerMongoAndSpring.service;

import com.DataViewerMongoAndSpring.model.ChartData;
import com.DataViewerMongoAndSpring.repository.ChartDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartDataService {

    @Autowired
    private ChartDataRepository chartDataRepository;

    public void saveChartData(List<ChartData> chartDataList) {
        chartDataRepository.saveAll(chartDataList);
    }

    public List<ChartData> findAll() {
        return chartDataRepository.findAll();
    }
}

