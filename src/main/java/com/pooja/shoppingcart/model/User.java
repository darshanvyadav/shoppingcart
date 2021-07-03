package com.pooja.shoppingcart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document(collection = "User")
@Data
public class User {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;
    private String password;
    private Boolean isDeleted;

}
