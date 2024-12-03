package com.example.usercrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userId")
    private String id;

    @Column(length = 255)
    private String name;

    @Column(length = 255)
    private String phoneNumber;

    @Column
    private Gender gender;

    public User(String id, String name, String phoneNumber, Gender gender) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    //Entity class should have param less constructor
    protected User() {}

}