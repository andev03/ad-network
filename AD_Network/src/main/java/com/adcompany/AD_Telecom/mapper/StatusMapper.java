package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Status;
import com.adcompany.AD_Telecom.model.StatusModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StatusMapper {

    StatusModel toStatusModel(Status status);

    Status status(StatusModel statusModel);
}
