package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Customer;
import com.adcompany.AD_Telecom.model.Employee;

import java.util.List;

public interface CustomerDAO {
    Customer getCustomerByPhoneNumber(String phoneNumber);
}
