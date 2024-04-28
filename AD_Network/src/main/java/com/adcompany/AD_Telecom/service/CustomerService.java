package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.entity.Customer;
import com.adcompany.AD_Telecom.model.CustomerModel;

public interface CustomerService {
    CustomerModel findByPhoneNumber(String phoneNumber);
}
