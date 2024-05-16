package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.TransStatus;
import com.adcompany.AD_Telecom.model.TransStatusModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" ,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TransStatusMapper {

    TransStatusModel toTransStatusModel(TransStatus transStatus);

    TransStatus toTransStatus(TransStatusModel transStatusModel);
}
