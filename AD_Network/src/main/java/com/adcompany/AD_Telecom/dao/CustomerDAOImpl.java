package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Customer;
import com.adcompany.AD_Telecom.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    private final EntityManager entityManager;

    @Autowired
    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Customer getCustomerByPhoneNumber(String phoneNumber) {
        TypedQuery<Customer> query = entityManager.createQuery("Select c From Customer c Join Fetch c.locationId Where " +
                "c.phoneNumber = :phoneNumber", Customer.class);
        query.setParameter("phoneNumber", phoneNumber);
        return query.getSingleResult();
    }
}
