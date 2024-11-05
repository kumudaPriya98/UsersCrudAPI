package com.example.usercrud.model;

import lombok.Getter;

@Getter
public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private Gender gender;

    public User(String id, String name, String phoneNumber, Gender gender) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

}