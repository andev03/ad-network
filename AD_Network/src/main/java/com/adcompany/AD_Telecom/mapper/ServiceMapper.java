package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.entity.ServiceStatus;
import com.adcompany.AD_Telecom.model.ServiceModel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DeviceMapper.class})
public interface ServiceMapper {
    @Mapping(source = "deviceId", target = "device")
    @Mapping(source = "serviceTypeId", target = "serviceType")
    @Mapping(source = "serviceStatusId", target = "serviceStatus")
    ServiceModel toServiceModel(Service service);

    @InheritInverseConfiguration(name = "toServiceModel")
    Service toService(ServiceModel toServiceModel);

    List<ServiceModel> toServiceModelList(List<Service> services);

    List<Service> toServiceList(List<ServiceModel> serviceModels);
}
