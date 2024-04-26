package com.adcompany.AD_Telecom.controller.employee;

import com.adcompany.AD_Telecom.dao.ContractDAO;
import com.adcompany.AD_Telecom.dao.ContractDAOImpl;
import com.adcompany.AD_Telecom.model.Contract;
import com.adcompany.AD_Telecom.model.Customer;
import com.adcompany.AD_Telecom.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final ContractService contractService;

    public EmployeeController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/hehe{cusId}")
    public List<Contract> contract(@PathVariable Customer cusId) {
        return contractService.getContractByCusId(cusId);
    }
}
