package com.example.simplemodel.models;

public class TestModel {
    private String date;
    private boolean isRed;

    public TestModel(String date) {
        this.date = date;
        this.isRed = false;
    }

    public String getDate() {
        return date;
    }

    public boolean isRed() {
        return isRed;
    }

    public void setRed(boolean red) {
        isRed = red;
    }
}
