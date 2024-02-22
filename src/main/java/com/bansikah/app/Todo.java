package com.bansikah.app;
import java.util.Objects;

@SuppressWarnings("unused")
public class Todo {
    private String title;
    private String decription;
    private boolean isComplete;

    public Todo(String title, String decription) {
        this.title = title;
        this.decription = decription;
        this.isComplete = false;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return this.decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public boolean isIsComplete() {
        return this.isComplete;
    }

    public boolean getIsComplete() {
        return this.isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    
    public void markAsComplete() {
        this.isComplete = true;
    }
}
