package com.example.nt118project.response;

public class LoginResponse {
    private String access_token;
    private String expires_in;
    private String refresh_token;
    public String getAccess_token() {
        return access_token;
    }
    public String getExpires_in() {
        return expires_in;
    }
    public String getRefresh_token() {
        return refresh_token;
    }
}