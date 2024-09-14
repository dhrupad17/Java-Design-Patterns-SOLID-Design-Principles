package com.dhruv.solid;

import com.dhruv.solid.assets.UserPersistenceService;
import com.dhruv.solid.assets.UserValidator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private UserPersistenceService persistenceService=new UserPersistenceService();

    //Create a New user
    public String createUser(String userJson)throws IOException{
        ObjectMapper mapper=new ObjectMapper();

        User user=mapper.readValue(userJson, User.class);

        UserValidator validator=new UserValidator();
        boolean valid=validator.validateUser(user);

        if (!valid){
            return "ERROR IN ADDIMG USER";
        }
        persistenceService.saveUser(user);

        return "SUCCESSFULLY ADDED USER";

    }

}
