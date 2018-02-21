package com.watchman.registration.user;

public class User {

    private int id;
    private String name;
    private String password;
    private String username;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String name, String password, String username) {
        this.name = name;
        this.username = username;
        this.password = password;

    }

}
