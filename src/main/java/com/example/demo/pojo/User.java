package com.example.demo.pojo;

import jakarta.persistence.*;

@Table(name="tb_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    @Column(name="user_name")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private  String email;


    public String getUsername() {
        return username;
    }
    public void setUsername(String name) {
        username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{"+
                "userId="+userId+
                ",username='"+username+'\''+
                ",password='"+password+'\''+
                ",email='"+email+'\''+
                '}';

    }
}

