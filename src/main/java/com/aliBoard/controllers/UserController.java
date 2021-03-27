package com.aliBoard.controllers;

import com.aliBoard.models.UserProfile;
import com.aliBoard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/user-list")
    public List<UserProfile> fetchUsers(@RequestParam(name = "status") String status) {
        return userService.fetchUserList(status);
    }

    @CrossOrigin
    @PatchMapping("/user-update")
    public void fetchUsers(@RequestParam(name = "email") String email, @RequestParam(name = "status") String status) {
        userService.updateUserStatus(email, status);
    }


}
