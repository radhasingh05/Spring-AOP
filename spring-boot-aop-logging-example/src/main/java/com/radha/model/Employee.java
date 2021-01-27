package com.radha.model;

import lombok.Data;

@Data
public class Employee {

    private Integer empId;
    private String firstName;
    private String lastName;
    private Address address;

}
