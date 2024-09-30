package com.dhruv.creator;

import com.dhruv.model.Message;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg=createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory Method
    protected  abstract Message createMessage();
}
