package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Customer;

public interface CustomerDAO {
    Customer getCustomerByPhoneNumber(String phoneNumber);
}
