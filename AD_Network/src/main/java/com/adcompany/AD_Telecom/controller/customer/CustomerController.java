package com.adcompany.AD_Telecom.controller.customer;

import com.adcompany.AD_Telecom.model.Customer;
import com.adcompany.AD_Telecom.service.ContractService;
import com.adcompany.AD_Telecom.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final ContractService contractService;

    public CustomerController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/profile")
    public String profile() {
        return "views/customer/profile_customer";
    }

    @GetMapping("/contract{cusId}")
    public String contract(@PathVariable Customer cusId, Model theModel) {
        theModel.addAttribute("contract", contractService.getContractByCusId(cusId));
        return "views/customer/contract";
    }

}
