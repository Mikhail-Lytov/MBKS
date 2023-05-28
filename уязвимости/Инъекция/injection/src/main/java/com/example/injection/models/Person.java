package com.example.injection.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;


    private String name;

    private int age;

    @NotEmpty(message = "empty string")
    @Email(message = "this is not an email")
    private String email;
}
