package com.groupd.SchoolManagementSystem.repositories;

import com.groupd.SchoolManagementSystem.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
