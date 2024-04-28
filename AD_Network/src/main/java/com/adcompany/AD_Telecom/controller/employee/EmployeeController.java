package com.adcompany.AD_Telecom.controller.employee;

import com.adcompany.AD_Telecom.dao.ATestDao;
import com.adcompany.AD_Telecom.entity.Customer;
import com.adcompany.AD_Telecom.entity.Location;
import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.entity.Transactions;
import com.adcompany.AD_Telecom.mapper.EmployeeMapper;
import com.adcompany.AD_Telecom.mapper.LocationMapper;
import com.adcompany.AD_Telecom.mapper.ServiceMapper;
import com.adcompany.AD_Telecom.model.*;
import com.adcompany.AD_Telecom.service.ContractService;
import com.adcompany.AD_Telecom.service.CustomerService;
import com.adcompany.AD_Telecom.service.ServiceManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {


    private final EmployeeMapper employeeMapper;
    private final ATestDao aTestDao;
    private final ContractService contractService;

    @Autowired
    public EmployeeController(EmployeeMapper employeeMapper, ATestDao aTestDao, ContractService contractService) {
        this.employeeMapper = employeeMapper;
        this.aTestDao = aTestDao;
        this.contractService = contractService;
    }

    @GetMapping("/hhhhh/{cusId}")
    public List<ContractModel> serviceModels(@PathVariable Customer cusId) {
        return contractService.getContractByCusId(cusId);
    }
}
