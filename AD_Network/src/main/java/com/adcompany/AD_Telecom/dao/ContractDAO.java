package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.entity.Contract;
import com.adcompany.AD_Telecom.entity.Customer;

import java.util.List;

public interface ContractDAO {
    public List<Contract> getContractByCusId(Customer cusId);
}
