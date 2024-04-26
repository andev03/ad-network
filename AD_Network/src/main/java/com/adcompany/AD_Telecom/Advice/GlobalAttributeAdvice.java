package com.adcompany.AD_Telecom.Advice;

import com.adcompany.AD_Telecom.dao.CustomerRepository;
import com.adcompany.AD_Telecom.model.Service;
import com.adcompany.AD_Telecom.model.ServiceType;
import com.adcompany.AD_Telecom.service.ServiceManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@ControllerAdvice
public class GlobalAttributeAdvice {

    private final ServiceManagerService serviceManagerService;


    @Autowired
    public GlobalAttributeAdvice(ServiceManagerService serviceManagerService) {
        this.serviceManagerService = serviceManagerService;
    }

    @ModelAttribute("theServiceType")
    public List<ServiceType> addServiceType() {
        return serviceManagerService.getServiceType();
    }

}
