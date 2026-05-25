package com.student.studentinfo.controller;

import com.student.studentinfo.entity.User;
import com.student.studentinfo.repository.UserRepository;
import com.student.studentinfo.security.JwtService;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/auth")

public class AuthController {

    private final UserRepository repository;

    private final JwtService jwtService;

    public AuthController(
            UserRepository repository,

            JwtService jwtService) {

        this.repository = repository;
        this.jwtService = jwtService;
    }

    // REGISTER

    @PostMapping("/register")

    public User register(
            @RequestBody User user) {

        return repository.save(user);
    }

    // LOGIN

    @PostMapping("/login")

    public String login(
            @RequestBody User user) {

        User existingUser = repository

                .findByEmail(user.getEmail())

                .orElseThrow();

        if(existingUser.getPassword()
                .equals(user.getPassword())) {

            return jwtService.generateToken(
                    user.getEmail());
        }

        return "Invalid password";
    }
}