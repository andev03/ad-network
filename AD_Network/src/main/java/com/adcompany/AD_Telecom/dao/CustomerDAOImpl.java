package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    private final EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //    @Override
    public List<Customer> getServiceByTypeName() {
        TypedQuery<Customer> query = entityManager.createQuery("Select c From Customer c", Customer.class);
        return query.getResultList();
    }
}
