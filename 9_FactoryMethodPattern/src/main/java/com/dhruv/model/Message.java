package com.dhruv.model;

public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders(){
        //Add some Default headers
    }

    public void encrypt(){
        //Code to encrypt the content
    }
}
