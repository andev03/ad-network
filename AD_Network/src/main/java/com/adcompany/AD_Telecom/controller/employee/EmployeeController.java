package com.adcompany.AD_Telecom.controller.employee;

import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.entity.Transactions;
import com.adcompany.AD_Telecom.model.ServiceModel;
import com.adcompany.AD_Telecom.service.ServiceManagerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final ServiceManagerService serviceManagerService;

    public EmployeeController(ServiceManagerService serviceManagerService) {
        this.serviceManagerService = serviceManagerService;
    }

    @GetMapping("/hhhhh")
    public List<ServiceModel> serviceModels(){
        return serviceManagerService.getServiceByTypeName("internet");
    }
}
