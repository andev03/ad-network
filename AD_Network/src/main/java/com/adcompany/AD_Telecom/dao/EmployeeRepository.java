package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByEmail(String email);
}
