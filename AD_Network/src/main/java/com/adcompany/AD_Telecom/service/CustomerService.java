package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.model.Customer;

public interface CustomerService {
    Customer findByPhoneNumber(String phoneNumber);
}
