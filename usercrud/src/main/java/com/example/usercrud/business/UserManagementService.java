package com.example.usercrud.business;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.example.usercrud.model.User;
import com.example.usercrud.model.Gender;

import org.springframework.stereotype.Service;

@Service
public class UserManagementService {
    Map<String, User> users;

    public UserManagementService() {
        users = new HashMap<>();
    }

    public User createUser(String id, String name, String phoneNumber, Gender gender) {
        if (users.containsKey(id)) {
            throw new RuntimeException("User with id " + id + " already exisits");
        }

        User newUser = new User(id, name, phoneNumber, gender);
        users.put(id, newUser);
        return newUser;
    }

    public List<User> getUsers() {
        return new ArrayList(users.values());
    }
}