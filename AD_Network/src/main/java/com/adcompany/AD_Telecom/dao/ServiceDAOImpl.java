package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Service;
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
    public List<Service> getServiceByTypeId(int serviceTypeId) {
        TypedQuery<Service> query = entityManager.createQuery("Select s From Service s Where s.serviceTypeId.serviceTypeId = :serviceTypeId", Service.class);
        query.setParameter("serviceTypeId", serviceTypeId);
        return query.getResultList();
    }
}
