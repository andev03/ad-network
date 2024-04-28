package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ServiceStatus;
import com.adcompany.AD_Telecom.entity.ServiceType;
import com.adcompany.AD_Telecom.model.ServiceStatusModel;
import com.adcompany.AD_Telecom.model.ServiceTypeModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceTypeMapper {

    ServiceTypeModel toServiceTypeModel(ServiceType serviceType);

    ServiceType toServiceType(ServiceTypeModel serviceTypeModel);

}
