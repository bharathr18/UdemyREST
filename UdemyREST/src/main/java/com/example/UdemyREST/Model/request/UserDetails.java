package com.example.UdemyREST.Model.request;

import javax.validation.constraints.*;

public class UserDetails {

    @NotNull(message = "Name cannot be invalid")
    private String name;
    @NotNull(message = "Email cannot be invalid")
    @Email
    private String emailId;
    @NotNull(message = "UserId cannot be invalid")
    private String userID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
