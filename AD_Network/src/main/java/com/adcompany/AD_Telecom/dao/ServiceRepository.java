package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
