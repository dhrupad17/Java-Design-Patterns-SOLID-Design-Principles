package com.dhruv.solid;

import java.io.IOException;

public class Main {

    private static final String VALID_USER_JSON="{\"name\": \"Dhrupad\", \"email\": \"dhrupad@email.com\", \"address\":\"Howrah, WestBengal\"}";

    private static final String INVALID_USER_JSON="{\"name\": \"Dhruv\", \"email\": \"dhruv@email\", \"address\":\"Kolkata\"}";

    public static void main(String[] args) throws IOException{
        UserController controller=new UserController();

        //Check with Valid JSON
        String response=controller.createUser(VALID_USER_JSON);

        if(!response.equalsIgnoreCase(("SUCCESSFULLY ADDED USER")))
            System.err.println("FAILED TO ADD USER");
        System.out.println("Valid JSON response : "+response);

        //Check with InValid JSON
        response=controller.createUser(INVALID_USER_JSON);

        if(!response.equalsIgnoreCase(("ERROR IN ADDIMG USER")))
            System.err.println("FAILED TO ADD USER");
        System.out.println("Invalid JSON response : "+response);

    }
}
