package com.example.nt118project.util;

public class ResetPasswordBody {
    private String value;
    private boolean temporary;

    public ResetPasswordBody(String value, boolean temporary) {
        this.value = value;
        this.temporary = temporary;
    }
}
