package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ServiceStatus;
import com.adcompany.AD_Telecom.model.ServiceStatusModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServiceStatusMapper {
    
    ServiceStatusModel toServiceStatusModel(ServiceStatus serviceStatus);

    ServiceStatus toServiceStatus(ServiceStatusModel serviceStatusModel);
}
