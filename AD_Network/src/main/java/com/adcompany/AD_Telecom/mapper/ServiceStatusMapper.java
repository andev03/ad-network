package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ServiceStatus;
import com.adcompany.AD_Telecom.model.ServiceStatusModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServiceStatusMapper {
    
    ServiceStatusModel toServiceStatusModel(ServiceStatus serviceStatus);

    ServiceStatus toServiceStatus(ServiceStatusModel serviceStatusModel);
}
