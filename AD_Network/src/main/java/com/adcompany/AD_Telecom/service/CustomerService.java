package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.entity.Customer;

public interface CustomerService {
    Customer findByPhoneNumber(String phoneNumber);
}
