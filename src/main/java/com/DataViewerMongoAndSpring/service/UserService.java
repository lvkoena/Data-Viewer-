package com.DataViewerMongoAndSpring.service;

import com.DataViewerMongoAndSpring.model.User;
import com.DataViewerMongoAndSpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    // Additional methods for CRUD operations
}
