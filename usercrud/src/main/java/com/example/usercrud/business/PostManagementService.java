package com.example.usercrud.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.usercrud.model.Post;
import com.example.usercrud.repo.PostRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostManagementService {
    PostRepository postRepository;

    public PostManagementService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(String text) {
        Post newPost = new Post(text);
        postRepository.save(newPost);
        return newPost;
    }

    public List<Post> getPosts() {
        return postRepository.findAll();
    }



}