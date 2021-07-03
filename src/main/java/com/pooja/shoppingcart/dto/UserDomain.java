package com.pooja.shoppingcart.dto;

import com.pooja.shoppingcart.model.Address;
import lombok.Data;

import java.util.UUID;

@Data
public class UserDomain {
    private UUID userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;
    private String password;
    private Boolean isDeleted;
}
