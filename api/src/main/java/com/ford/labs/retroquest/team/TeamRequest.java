package com.ford.labs.retroquest.team;


public interface TeamRequest {
    String getName();
    String getPassword();
    String getCaptchaValue();

    void setName(String name);
    void setPassword(String password);
    void setCaptchaValue(String captchaValue);
}
