package com.dhruv.model;

import com.dhruv.DTO.UserDTO;

import java.time.LocalDate;

//driver code
public class Client {
    public static void main(String[] args) {
        User user=createUser();

        //Client has to provide director with concrete builder
        UserDTO dto=directBuild(UserDTO.getBuilder(),user);
        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
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
