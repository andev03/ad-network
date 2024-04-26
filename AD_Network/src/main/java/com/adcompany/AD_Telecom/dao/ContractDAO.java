package com.adcompany.AD_Telecom.dao;

import com.adcompany.AD_Telecom.model.Contract;
import com.adcompany.AD_Telecom.model.Customer;

import java.util.List;

public interface ContractDAO {
    public List<Contract> getContractByCusId(Customer cusId);
}
