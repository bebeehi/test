package com.example.restapi.number;

public class ResponseModel {
    private String id;

    public ResponseModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseModel(String id) {
        this.id = id;
    }
}