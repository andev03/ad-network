package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.entity.Contract;
import com.adcompany.AD_Telecom.entity.Customer;

import java.util.List;

public interface ContractService {
    public List<Contract> getContractByCusId(Customer cusId);
}
