package com.adcompany.AD_Telecom.controller;

import com.adcompany.AD_Telecom.dao.ServiceDAO;
import com.adcompany.AD_Telecom.model.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @GetMapping("/internet")
    public List<Service> getInternet(){
        return null;
    }
}
