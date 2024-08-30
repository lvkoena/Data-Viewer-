package com.DataViewerMongoAndSpring.controller;

import com.DataViewerMongoAndSpring.model.PieChartData;
import com.DataViewerMongoAndSpring.model.User;
import com.DataViewerMongoAndSpring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/chart-data")
    public List<PieChartData> getChartData() {
        return service.getChartData();
    }

    @GetMapping("/line-data")
    public List<StackedLineData> getStackedLineChartData() {
        return service.getStackedLineChartData();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
