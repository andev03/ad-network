package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ContractStatus;
import com.adcompany.AD_Telecom.model.ContractStatusModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractStatusMapper {

    ContractStatusModel toContractStatusModel(ContractStatus contractStatus);

    ContractStatus toContractStatus(ContractStatusModel contractStatusModel);
}
