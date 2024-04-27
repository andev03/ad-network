package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Service;
import com.adcompany.AD_Telecom.model.ServiceModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    ServiceModel toServiceModel(Service service);

    Service toService(ServiceModel toServiceModel);

    List<ServiceModel> toServiceModelList(List<Service> services);

    List<Service> toServiceList(List<ServiceModel> serviceModels);
}
