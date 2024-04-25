package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.dao.ServiceDAO;
import com.adcompany.AD_Telecom.model.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceManagerServiceImpl implements ServiceManagerService {

    private ServiceDAO serviceDAO;

    @Autowired
    public ServiceManagerServiceImpl(ServiceDAO serviceDAO) {
        this.serviceDAO = serviceDAO;
    }

    @Override
    public List<ServiceType> getServiceType() {
        return serviceDAO.getServiceType();
    }

    @Override
    public List<com.adcompany.AD_Telecom.model.Service> getServiceByTypeName(String serviceTypeName) {
        return serviceDAO.getServiceByTypeName(serviceTypeName);
    }
}
