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

    // Initialize sample data
    @PostConstruct
    public void initData() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setChartData(List.of(
                new PieChartData("Search Engine", 1048),
                new PieChartData("Direct", 735),
                new PieChartData("Email", 580),
                new PieChartData("Union Ads", 484),
                new PieChartData("Video Ads", 300)
        ));
        repository.save(user);
    }
}
