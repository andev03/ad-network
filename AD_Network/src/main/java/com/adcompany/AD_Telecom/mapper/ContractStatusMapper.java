package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ContractStatus;
import com.adcompany.AD_Telecom.model.ContractStatusModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ContractStatusMapper {

    ContractStatusModel toContractStatusModel(ContractStatus contractStatus);

    ContractStatus toContractStatus(ContractStatusModel contractStatusModel);
}
