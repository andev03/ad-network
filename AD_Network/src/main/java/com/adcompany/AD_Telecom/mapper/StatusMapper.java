package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Status;
import com.adcompany.AD_Telecom.model.StatusModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatusMapper {

    StatusModel toStatusModel(Status status);

    Status status(StatusModel statusModel);
}
