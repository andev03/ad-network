package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.dao.CustomerDAO;
import com.adcompany.AD_Telecom.mapper.CustomerMapper;
import com.adcompany.AD_Telecom.model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO;

    private final CustomerMapper customerMapper;
    @Autowired
    public CustomerServiceImpl(CustomerDAO customerDAO, CustomerMapper customerMapper) {
        this.customerDAO = customerDAO;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerModel findByPhoneNumber(String phoneNumber) {
        return customerMapper.toCustomerModel(customerDAO.getCustomerByPhoneNumber(phoneNumber));
    }
}
