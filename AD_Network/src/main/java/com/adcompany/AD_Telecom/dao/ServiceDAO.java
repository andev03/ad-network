package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.entity.ServiceType;

import java.util.List;

public interface ServiceDAO {

    List<ServiceType> getServiceType();

    List<Service> getServiceByTypeName(String serviceTypeName);
}
