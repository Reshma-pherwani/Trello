package com.reshma.trello.model;

import java.util.UUID;

public class User {
    private UUID userId;
    private String userName;
    private String email;

    public User(String userName, String email) {
        this.userId = UUID.randomUUID();
        this.userName = userName;
        this.email = email;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
