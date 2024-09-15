package com.dhruv;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Message msg=new Message("This is the first message");
        MessagePrinter printer=new MessagePrinter();
        printer.writeMessage(msg,"test_message.txt");
    }
}
