package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ContractType;
import com.adcompany.AD_Telecom.model.ContractTypeModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ContractTypeMapper {
    ContractTypeModel toContractTypeModel(ContractType contractType);

    ContractType toContractType(ContractTypeModel contractTypeModel);
}
