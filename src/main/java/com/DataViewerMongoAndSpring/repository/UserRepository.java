package com.DataViewerMongoAndSpring.repository;

import com.DataViewerMongoAndSpring.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
