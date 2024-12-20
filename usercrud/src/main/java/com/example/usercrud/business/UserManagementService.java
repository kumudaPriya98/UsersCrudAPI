package com.example.usercrud.business;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.usercrud.model.Gender;
import com.example.usercrud.model.Post;
import com.example.usercrud.model.User;
import com.example.usercrud.repo.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserManagementService {
    UserRepository userRepository;

    public UserManagementService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String id, String name, String phoneNumber, Gender gender) {
        if (userRepository.findById(id).isPresent()) {
            throw new RuntimeException("User with id " + id + " already exisits");
        }

        User newUser = new User(id, name, phoneNumber, gender);
        userRepository.save(newUser);
        return newUser;
    }

    public Post createUserPost(String userId, Post post) {
        Optional<User> user = userRepository.findById(userId);
        if (!user.isPresent()) {
            throw new RuntimeException("User with id " + userId + " does not exisit");
        }
        user.get().addPost(post); 
        userRepository.save(user.get());
        // Instead of directly returning var post, as it has Id null
        // Data Transfer Object should be user here
        return post;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }


    public User getUser(String id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }

        throw new RuntimeException("User with id " + id + " does not exisit");
    }

}