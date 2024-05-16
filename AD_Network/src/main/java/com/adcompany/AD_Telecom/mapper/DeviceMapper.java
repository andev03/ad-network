package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Device;
import com.adcompany.AD_Telecom.model.DeviceModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeviceMapper {

    DeviceModel toDeviceModel(Device device);

    Device toDevice(DeviceModel deviceModel);
}
