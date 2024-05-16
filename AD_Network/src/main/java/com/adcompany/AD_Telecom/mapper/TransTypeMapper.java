package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.TransType;
import com.adcompany.AD_Telecom.model.TransTypeModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TransTypeMapper {

    TransTypeModel toTransTypeModel(TransType transType);

    TransType toTransType(TransTypeModel transTypeModel);
}
