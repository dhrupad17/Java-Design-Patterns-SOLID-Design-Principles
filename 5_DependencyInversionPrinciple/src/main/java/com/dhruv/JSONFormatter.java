package com.dhruv;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONFormatter implements  Formatter{

    @Override
    public String format(Message message) throws FormatException {
        ObjectMapper mapper=new ObjectMapper();
        try{
            return mapper.writeValueAsString(message);
        }catch(JsonProcessingException e){
            e.printStackTrace();
            throw  new FormatException(e);
        }
    }
}
