package com.dhruv.model;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {

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
