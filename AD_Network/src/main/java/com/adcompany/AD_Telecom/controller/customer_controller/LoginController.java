package com.adcompany.AD_Telecom.controller.customer_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login_customer")
    public String loginCustomer(){

        return "platforms/comingsoon";
    }
}
