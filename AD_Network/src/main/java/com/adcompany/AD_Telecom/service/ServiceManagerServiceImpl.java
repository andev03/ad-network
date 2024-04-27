package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.dao.ServiceDAO;
import com.adcompany.AD_Telecom.entity.ServiceType;
import com.adcompany.AD_Telecom.mapper.ServiceMapper;
import com.adcompany.AD_Telecom.model.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceManagerServiceImpl implements ServiceManagerService {

    private final ServiceDAO serviceDAO;

    private final ServiceMapper serviceMapper;

    @Autowired
    public ServiceManagerServiceImpl(ServiceDAO serviceDAO, ServiceMapper serviceMapper) {
        this.serviceDAO = serviceDAO;
        this.serviceMapper = serviceMapper;
    }

    @Override
    public List<ServiceType> getServiceType() {
        return serviceDAO.getServiceType();
    }

    @Override
    public List<ServiceModel> getServiceByTypeName(String serviceTypeName) {
        return serviceMapper.toServiceModelList(serviceDAO.getServiceByTypeName(serviceTypeName));
    }
}
