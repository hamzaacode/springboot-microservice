package org.example.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.userservice.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public UserResponse getUsers() {

        // Example dummy data
        List<String> users = List.of("User 1", "User 2", "User 3");

        return new UserResponse(
                "Fetched user list successfully",
                "SUCCESS",
                users
        );
    }
}