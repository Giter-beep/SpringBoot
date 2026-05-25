package com.student.studentinfo.repository;

import com.student.studentinfo.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository
        extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);
}