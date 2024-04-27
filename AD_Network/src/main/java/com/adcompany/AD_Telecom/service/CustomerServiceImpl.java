package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.dao.CustomerDAO;
import com.adcompany.AD_Telecom.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO;


    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public Customer findByPhoneNumber(String phoneNumber) {
        return customerDAO.getCustomerByPhoneNumber(phoneNumber);
    }
}
