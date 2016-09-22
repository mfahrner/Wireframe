package com.theironyard.charlotte;

/**
 * Created by mfahrner on 9/22/16.
 */
public class Message {
    String email;
    String text;

    public Message() {
    }

    public Message(String email, String text) {
        this.email = email;
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
