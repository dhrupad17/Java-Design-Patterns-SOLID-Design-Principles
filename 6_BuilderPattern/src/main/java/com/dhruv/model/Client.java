package com.dhruv.model;

import com.dhruv.DTO.UserDTO;
import com.dhruv.DTO.UserDTOBuilder;
import com.dhruv.DTO.UserWebDTOBuilder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user=createUser();
        UserDTOBuilder builder=new UserWebDTOBuilder();
        //Client has to provide director with concrete builder
        UserDTO dto=directBuild(builder,user);
        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();
    }

    public static User createUser(){
        User user=new User();

        user.setBirthday(LocalDate.of(2002,2,17));
        user.setFirstName("Dhrupad");
        user.setLastName("Chakraborty");
        Address address=new Address();
        address.setHouseNumber("14");
        address.setStreet("Kedar Bhattacharjee Lane");
        address.setCity("Howrah");
        address.setState("West Bengal");
        address.setZipcode("711104");
        user.setAddress(address);
        return user;
    }



}
