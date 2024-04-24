package com.adcompany.AD_Telecom.controller.service_controller;

import com.adcompany.AD_Telecom.service.ServiceManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services/internet")
public class InternetController {
    private ServiceManagerService serviceManagerService;

    @Autowired
    public InternetController(ServiceManagerService serviceManagerService) {
        this.serviceManagerService = serviceManagerService;
    }

    @GetMapping("/{internetId}")
    public String getService(Model theModel) {
        theModel.addAttribute("service", serviceManagerService.getServiceByTypeName("internet"));
        return "/views/customer/service/internet_service";
    }

}
