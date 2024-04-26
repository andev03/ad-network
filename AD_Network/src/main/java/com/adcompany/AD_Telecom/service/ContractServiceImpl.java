package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.dao.ContractDAO;
import com.adcompany.AD_Telecom.model.Contract;
import com.adcompany.AD_Telecom.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    private final ContractDAO contractDAO;

    @Autowired
    public ContractServiceImpl(ContractDAO contractDAO) {
        this.contractDAO = contractDAO;
    }

    @Override
    public List<Contract> getContractByCusId(Customer cusId) {
        return contractDAO.getContractByCusId(cusId);
    }
}
