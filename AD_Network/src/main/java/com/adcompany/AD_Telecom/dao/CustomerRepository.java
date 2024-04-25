package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByPhoneNumber(String phoneNumber);
}
