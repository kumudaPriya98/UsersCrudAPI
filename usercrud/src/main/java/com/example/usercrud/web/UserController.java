package com.example.usercrud.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.usercrud.business.UserManagementService;
import com.example.usercrud.model.User;


@RestController
@RequestMapping(path = "/users/")
public class UserController {
    private UserManagementService userManagementService;

    public UserController(UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return userManagementService.createUser(user.getId(), user.getName(), user.getPhoneNumber(), user.getGender());
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<User> getUsers() {
        return userManagementService.getUsers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUser(@PathVariable(value = "id") String id) {
        return userManagementService.getUser(id);
    }  


}