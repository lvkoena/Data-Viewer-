package com.DataViewerMongoAndSpring.service;

import com.DataViewerMongoAndSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) {
        return repository.save(user);
    }

    public List<PieChartData> getChartData() {
        List<User> users = repository.findAll();

        if(users.isEmpty()) {
            return Collections.emptyList();
        }
        User user = repository.findAll().get(0);
        return user.getChartData();
    }
}
