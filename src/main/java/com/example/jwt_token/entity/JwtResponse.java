package com.example.jwt_token.entity;

import java.util.List;

public class JwtResponse {

    private User user;
    private String jwtToken;
//    private List<String> roles;

    public JwtResponse(User user, String jwtToken) {
        this.user = user;
        this.jwtToken = jwtToken;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

//    public void setRoles(List<String> roles) {
//        this.roles = roles;
//    }
//
//    public List<String> getRoles() {
//        return roles;
//    }
}
