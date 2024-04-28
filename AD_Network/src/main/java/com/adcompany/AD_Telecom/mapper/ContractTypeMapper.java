package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ContractType;
import com.adcompany.AD_Telecom.model.ContractTypeModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContractTypeMapper {
    ContractTypeModel toContractTypeModel(ContractType contractType);

    ContractType toContractType(ContractTypeModel contractTypeModel);
}
