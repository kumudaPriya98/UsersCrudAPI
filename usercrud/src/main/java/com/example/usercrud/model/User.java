package com.example.usercrud.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    private String id;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String phoneNumber;

    @Column
    private Gender gender;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinColumn(name = "user_id")
    private List<Post> posts;


    public User(String id, String name, String phoneNumber, Gender gender) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    //Entity class should have param less constructor
    protected User() {}

    public void addPost(Post post) {
        posts.add(post);
    }

}