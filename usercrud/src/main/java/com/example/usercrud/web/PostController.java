package com.example.usercrud.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.usercrud.business.PostManagementService;
import com.example.usercrud.model.Post;


@RestController
@RequestMapping(path = "/posts/")
public class PostController {
    private PostManagementService postManagementService;

    public PostController(PostManagementService postManagementService) {
        this.postManagementService = postManagementService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody Post post) {
        return postManagementService.createPost(post.getText());
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public  List<Post> getPosts() {
        return postManagementService.getPosts();
    }


}