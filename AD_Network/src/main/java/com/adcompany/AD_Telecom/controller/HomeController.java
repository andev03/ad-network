package com.adcompany.AD_Telecom.controller;

import com.adcompany.AD_Telecom.service.ServiceManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private ServiceManagerService serviceManagerService;

    @Autowired
    public HomeController(ServiceManagerService serviceManagerService) {
        this.serviceManagerService = serviceManagerService;
    }

    @GetMapping("/")
    public String viewHomePage(Model theModel) {
        theModel.addAttribute("theServiceType", serviceManagerService.getServiceType());
        return "homepage";
    }

    @GetMapping("/coming_soon")
    public String comingSoon(Model theModel) {
        theModel.addAttribute("theServiceType", serviceManagerService.getServiceType());
        return "/platforms/comingsoon";
    }

    @GetMapping("/login")
    public String login(){
        return "/platforms/login";
    }
}
