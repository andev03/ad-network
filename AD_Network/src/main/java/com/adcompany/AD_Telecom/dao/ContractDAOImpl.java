package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Contract;
import com.adcompany.AD_Telecom.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContractDAOImpl implements ContractDAO{

    private final EntityManager entityManager;

    @Autowired
    public ContractDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Contract> getContractByCusId(Customer cusId){
        TypedQuery<Contract> query = entityManager.createQuery("Select c From Contract c Where c.cusId = :cusId", Contract.class);
        query.setParameter("cusId", cusId);
        return query.getResultList();
    }
}
