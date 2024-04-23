package com.adcompany.AD_Telecom.controller.service_controller;

import com.adcompany.AD_Telecom.dao.ServiceDAO;
import com.adcompany.AD_Telecom.service.ServiceManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services")
public class ServiceController {

    private final ServiceManagerService serviceManagerService;

    @Autowired
    public ServiceController(ServiceManagerService serviceManagerService) {
        this.serviceManagerService = serviceManagerService;
    }

    @GetMapping("/{serviceTypeName}")
    private String getService(@PathVariable String serviceTypeName, Model theModel) {
        theModel.addAttribute("services", serviceManagerService.getServiceByTypeName(serviceTypeName));
        theModel.addAttribute("theServiceType", serviceManagerService.getServiceType());
        theModel.addAttribute("serviceTypeName", serviceTypeName);
        return "views/customer/services/view_services_guest";
    }
}
