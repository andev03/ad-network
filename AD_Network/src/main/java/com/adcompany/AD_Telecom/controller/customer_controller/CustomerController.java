package com.adcompany.AD_Telecom.controller.customer_controller;

import com.adcompany.AD_Telecom.dao.CustomerRepository;
import com.adcompany.AD_Telecom.model.City;
import com.adcompany.AD_Telecom.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    @GetMapping("/profile")
    public String profile() {
        return "views/customer/profile_customer";
    }

}
