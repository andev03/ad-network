package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.entity.ServiceType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServiceDAOImpl implements ServiceDAO {
    private final EntityManager entityManager;

    @Autowired
    public ServiceDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<ServiceType> getServiceType() {
        TypedQuery<ServiceType> query = entityManager.createQuery("Select st From ServiceType st", ServiceType.class);
        return query.getResultList();
    }

    @Override
    public List<Service> getServiceByTypeName(String serviceTypeName) {
        TypedQuery<Service> query = entityManager.createQuery("Select s From Service s Where s.serviceTypeId.serviceTypeName = :serviceTypeName", Service.class);
        query.setParameter("serviceTypeName", serviceTypeName);
        return query.getResultList();
    }
}
