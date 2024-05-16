package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.ServiceStatus;
import com.adcompany.AD_Telecom.entity.ServiceType;
import com.adcompany.AD_Telecom.model.ServiceStatusModel;
import com.adcompany.AD_Telecom.model.ServiceTypeModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ServiceTypeMapper {

    ServiceTypeModel toServiceTypeModel(ServiceType serviceType);

    ServiceType toServiceType(ServiceTypeModel serviceTypeModel);

}
