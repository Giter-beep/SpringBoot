package com.student.studentinfo.controller;

import com.student.studentinfo.entity.User;

import com.student.studentinfo.repository.UserRepository;

import com.student.studentinfo.security.JwtService;

import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/auth")

public class AuthController {

    private final UserRepository repository;

    private final JwtService jwtService;

    private final PasswordEncoder passwordEncoder;

    public AuthController(

            UserRepository repository,

            JwtService jwtService,

            PasswordEncoder passwordEncoder) {

        this.repository = repository;

        this.jwtService = jwtService;

        this.passwordEncoder = passwordEncoder;
    }

    // REGISTER

    @PostMapping("/register")

    public User register(
            @RequestBody User user) {

        user.setPassword(

                passwordEncoder.encode(
                        user.getPassword())

        );

        return repository.save(user);
    }

    // LOGIN

    @PostMapping("/login")

    public String login(
            @RequestBody User user) {

        User existingUser = repository

                .findByEmail(user.getEmail())

                .orElseThrow();

        if(passwordEncoder.matches(

                user.getPassword(),

                existingUser.getPassword())) {

            return jwtService.generateToken(
                    user.getEmail());
        }

        return "Invalid password";
    }
}