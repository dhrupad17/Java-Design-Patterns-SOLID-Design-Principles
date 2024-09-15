package com.dhruv;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) throws IOException {

        Message msg=new Message("This is the first message");
        MessagePrinter printer=new MessagePrinter();
        try(PrintWriter writer=new PrintWriter(System.out)){
            printer.writeMessage(msg,new JSONFormatter(),writer);
        } catch (FormatException e) {
            throw new RuntimeException(e);
        }
    }
}
