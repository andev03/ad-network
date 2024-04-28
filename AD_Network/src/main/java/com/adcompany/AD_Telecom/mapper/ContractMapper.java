package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Contract;
import com.adcompany.AD_Telecom.entity.Customer;
import com.adcompany.AD_Telecom.model.ContractModel;
import com.adcompany.AD_Telecom.model.CustomerModel;
import com.adcompany.AD_Telecom.model.EmployeeModel;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CustomerMapper.class, EmployeeMapper.class})
public interface ContractMapper {

    @Mapping(target = "customer", source = "cusId")
    @Mapping(target = "employee", source = "empId")
    @Mapping(target = "contractTypeName", source = "contractTypeId.contractTypeName")
    @Mapping(target = "contractStatusName", source = "contractStatusId.contractStatusName")
    @Mapping(target = "startDate", source = "startDate", dateFormat = "dd-MM-yyyy")
    @Mapping(target = "endDate", source = "endDate", dateFormat = "dd-MM-yyyy")
    ContractModel toContractModel(Contract contract);

    @InheritInverseConfiguration(name = "toContractModel")
    Contract toContract(ContractModel contractModel);

    List<ContractModel> toContractModelList(List<Contract> contractList);

    List<Contract> toContractList(List<ContractModel> contractModelList);

    @AfterMapping
    default void configureData(@MappingTarget ContractModel contractModel) {
        contractModel.setCustomer(new CustomerModel(contractModel.getCustomer().getCusId(),
                contractModel.getCustomer().getFirstName(),
                contractModel.getCustomer().getLastName(),
                contractModel.getCustomer().getPhoneNumber()));

        contractModel.setEmployee(new EmployeeModel(contractModel.getEmployee().getEmpId(),
                contractModel.getEmployee().getFirstName(),
                contractModel.getEmployee().getLastName(),
                contractModel.getEmployee().getPhoneNumber(),
                contractModel.getEmployee().getEmail()));

    }
}
