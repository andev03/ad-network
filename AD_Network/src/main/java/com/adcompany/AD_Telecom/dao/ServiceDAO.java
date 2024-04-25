package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Service;
import com.adcompany.AD_Telecom.model.ServiceType;

import java.util.List;

public interface ServiceDAO {

    List<ServiceType> getServiceType();

    List<Service> getServiceByTypeName(String serviceTypeName);
}
