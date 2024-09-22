package com.dhruv.DTO;

import com.dhruv.model.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {

    //methods to build "parts" of product at a time
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //method to "assemble" final product
    UserDTO build();
    //(optional) method to fetch already built object
    UserDTO getUserDTO();

}
