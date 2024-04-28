package com.adcompany.AD_Telecom.service;

import com.adcompany.AD_Telecom.dao.ContractDAO;
import com.adcompany.AD_Telecom.entity.Contract;
import com.adcompany.AD_Telecom.entity.Customer;
import com.adcompany.AD_Telecom.mapper.ContractMapper;
import com.adcompany.AD_Telecom.model.ContractModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    private final ContractDAO contractDAO;

    private final ContractMapper contractMapper;

    @Autowired
    public ContractServiceImpl(ContractDAO contractDAO, ContractMapper contractMapper) {
        this.contractDAO = contractDAO;
        this.contractMapper = contractMapper;
    }

    @Override
    public List<ContractModel> getContractByCusId(Customer cusId) {
        return contractMapper.toContractModelList(contractDAO.getContractByCusId(cusId));
    }
}
