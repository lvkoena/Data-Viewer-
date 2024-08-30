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

    public List<PieChartData> getChartData() {
        User user = repository.findAll().get(0);  // Assuming a single user for simplicity
        return user.getChartData();
    }

    // Initialize sample data
    @PostConstruct
    public void initData() {
        User user = new User();
        user.setChartData(List.of(
                new PieChartData("AWS", 44, 2024),
                new PieChartData("AWS", 43, 2023),
                new PieChartData("Microsoft Azure", 29, 2024),
                new PieChartData("Microsoft Azure", 28, 2023),
                new PieChartData("Google Cloud Platform", 9, 2024),
                new PieChartData("Google Cloud Platform", 11, 2023),
                new PieChartData("Cloudflare", 2, 2024),
                new PieChartData("Cloudflare", 1, 2023),
                new PieChartData("DigitalOcean", 2, 2024),
                new PieChartData("DigitalOcean", 2, 2023),
                new PieChartData("Vercel", 2, 2024),
                new PieChartData("Vercel", 1, 2023),
                new PieChartData("Heroku", 1, 2024),
                new PieChartData("Heroku", 3, 2023)
        ));
        repository.save(user);
    }
}
