package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.model.Service;
import com.adcompany.AD_Telecom.model.ServiceType;

import java.util.List;

public interface ServiceManagerService {

    List<ServiceType> getServiceType();

    List<Service> getServiceByTypeName(String serviceTypeName);
}
