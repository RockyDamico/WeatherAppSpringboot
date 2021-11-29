package com.tts.weatherapp.domain;

public class Request {
    private String zipCode;

    @Override
    public String toString() {
        return "Request [zipCode=" + zipCode + "]";
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Request(String zipCode) {
        this.zipCode = zipCode;
    }

    public Request() {
    }
}