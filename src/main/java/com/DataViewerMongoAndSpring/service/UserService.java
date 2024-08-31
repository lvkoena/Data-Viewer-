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
        User user = repository.findAll().get(0);
        return user.getChartData();
    }

    // Initialize sample data
    @PostConstruct
    public void initData() {
        User user = new User();
        user.setChartData(List.of(
                new PieChartData("AWS", 44),
                new PieChartData("AWS", 43),
                new PieChartData("Microsoft Azure", 29),
                new PieChartData("Microsoft Azure", 28),
                new PieChartData("Google Cloud Platform", 9),
                new PieChartData("Google Cloud Platform", 11),
                new PieChartData("Cloudflare", 2),
                new PieChartData("Cloudflare", 1),
                new PieChartData("DigitalOcean", 2),
                new PieChartData("DigitalOcean", 2),
                new PieChartData("Vercel", 2),
                new PieChartData("Vercel", 1),
                new PieChartData("Heroku", 1),
                new PieChartData("Heroku", 3)
        ));
        repository.save(user);
    }
}
