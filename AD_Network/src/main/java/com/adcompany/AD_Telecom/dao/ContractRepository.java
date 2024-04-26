package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

}
