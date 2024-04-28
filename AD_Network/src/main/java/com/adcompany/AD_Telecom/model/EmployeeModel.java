package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(force = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeModel {
    private int empId;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String roleName;

    private LocationModel location;

    private String statusName;

    public EmployeeModel(int empId, String firstName, String lastName, String phoneNumber, String email) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
