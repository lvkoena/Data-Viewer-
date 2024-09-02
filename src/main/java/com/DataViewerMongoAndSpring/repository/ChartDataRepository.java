package com.DataViewerMongoAndSpring.repository;

import com.DataViewerMongoAndSpring.model.ChartData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChartDataRepository extends MongoRepository<ChartData, String> {
}
