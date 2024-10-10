package com.dhruv;

import com.dhruv.creator.JSONMessageCreator;
import com.dhruv.creator.MessageCreator;
import com.dhruv.creator.TextMessageCreator;
import com.dhruv.model.Message;

public class client {

    //Driver Code
    public static void main(String[] args) {

        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());

    }
    public static void printMessage(MessageCreator creator){

        Message msg= creator.getMessage();
        System.out.println(msg);

    }
}
