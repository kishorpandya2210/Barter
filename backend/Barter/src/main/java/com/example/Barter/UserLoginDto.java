package com.example.Barter;

public class UserLoginDto {
    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }
}
