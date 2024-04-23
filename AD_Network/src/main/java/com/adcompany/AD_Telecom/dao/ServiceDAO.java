package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Service;

import java.util.List;

public interface ServiceDAO {

    List<Service> getServiceType();
    List<Service> getServiceByTypeName(String serviceTypeName);
}
