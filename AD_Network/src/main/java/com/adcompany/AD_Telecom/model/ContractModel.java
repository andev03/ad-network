package com.adcompany.AD_Telecom.model;

import lombok.Data;

@Data
public class ContractModel {

    private CustomerModel customer;

    private EmployeeModel employee;

    private String contractTypeName;

    private String startDate;

    private String endDate;

    private double amount;

    private int renewalCount;

    private String contractStatusName;
    
}
