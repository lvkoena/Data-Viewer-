package com.DataViewerMongoAndSpring.controller;

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

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/chart-data")
    public List<Map<String, Object>> getUsersForChart() {
        List<User> users = service.getAllUsers();

        // Grouping users by name and calculating the count for each group
        Map<String, Long> userCounts = users.stream()
                .collect(Collectors.groupingBy(User::getName, Collectors.counting()));

        // Transforming the data into the structure expected by ECharts
        return userCounts.entrySet().stream()
                .map(entry -> Map.of("name", entry.getKey(), "value", entry.getValue()))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
