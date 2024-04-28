package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Employee;
import com.adcompany.AD_Telecom.entity.Location;
import com.adcompany.AD_Telecom.model.EmployeeModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ATestDao {
    private final EntityManager entityManager;

    @Autowired
    public ATestDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Location location(int id){
        TypedQuery<Location> query = entityManager.createQuery("select l From Location l Where l.locationId = :data", Location.class);
        query.setParameter("data", id);
        return query.getSingleResult();
    }

    public Employee employeeModel(int id){
        TypedQuery<Employee> query = entityManager.createQuery("select e From Employee e Where e.empId = :data", Employee.class);
        query.setParameter("data", id);
        return query.getSingleResult();
    }
}
