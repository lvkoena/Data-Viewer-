package com.DataViewerMongoAndSpring.service;

import com.DataViewerMongoAndSpring.model.PieChartData;
import com.DataViewerMongoAndSpring.model.User;
import com.DataViewerMongoAndSpring.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<PieChartData> getChartData() {
        User user = repository.findAll().get(0);  // Assuming a single user for simplicity
        return user.getChartData();
    }

    // Initialize sample data
    @PostConstruct
    public void initData() {
        User user = new User();
//        user.setName("John Doe");
//        user.setEmail("john.doe@example.com");
        user.setChartData(List.of(
                new PieChartData("Java Developers", 1047),
                new PieChartData("Angular Developers", 745),
                new PieChartData("Python Developers", 580),
                new PieChartData("C# Developers", 484),
                new PieChartData(".Net Developers", 300)
        ));
        repository.save(user);
    }
}
