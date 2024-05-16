package com.adcompany.AD_Telecom.advice;

import com.adcompany.AD_Telecom.entity.ServiceType;
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
