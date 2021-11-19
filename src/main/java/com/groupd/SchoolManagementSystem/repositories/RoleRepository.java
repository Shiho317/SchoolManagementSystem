package com.groupd.SchoolManagementSystem.repositories;

import com.groupd.SchoolManagementSystem.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}