package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.entity.ServiceType;
import com.adcompany.AD_Telecom.model.ServiceModel;

import java.util.List;

public interface ServiceManagerService {

    List<ServiceType> getServiceType();

    List<ServiceModel> getServiceByTypeName(String serviceTypeName);
}
