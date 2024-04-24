package com.adcompany.AD_Telecom.controller.customer_controller;

import com.adcompany.AD_Telecom.dao.CustomerDAOImpl;
import com.adcompany.AD_Telecom.dao.CustomerRepository;
import com.adcompany.AD_Telecom.model.Customer;
import com.adcompany.AD_Telecom.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private final CustomerDAOImpl customerDAO;
    private final CustomerRepository customerRepository;
    @Autowired
    public DemoController(CustomerDAOImpl customerDAO, CustomerRepository customerRepository) {
        this.customerDAO = customerDAO;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customer")
    public Customer getAllCustomer(){
        return customerRepository.findByPhoneNumberAndPassword("0123456789", "password123");
    }
}
