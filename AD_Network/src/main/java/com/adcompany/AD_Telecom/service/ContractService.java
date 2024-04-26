package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.model.Contract;
import com.adcompany.AD_Telecom.model.Customer;

import java.util.List;

public interface ContractService {
    public List<Contract> getContractByCusId(Customer cusId);
}
