package com.example.usercrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usercrud.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
    
}