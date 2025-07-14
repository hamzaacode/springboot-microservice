package org.example.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        log.info("Get user list successfully");
        return "List of Users";
    }
}