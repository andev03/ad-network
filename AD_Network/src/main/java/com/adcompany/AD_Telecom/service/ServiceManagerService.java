package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.model.Service;

import java.util.List;

public interface ServiceManagerService {

    List<Service> getServiceType();
    List<Service> getServiceByTypeName(String serviceTypeName);
}
