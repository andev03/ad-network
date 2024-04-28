package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerModel {

    private int cusId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String statusName;

    private LocationModel location;

    public CustomerModel(int cusId, String firstName, String lastName, String phoneNumber) {
        this.cusId = cusId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
}
