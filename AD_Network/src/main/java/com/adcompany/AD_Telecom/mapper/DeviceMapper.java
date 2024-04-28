package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Device;
import com.adcompany.AD_Telecom.model.DeviceModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DeviceMapper {

    DeviceModel toDeviceModel(Device device);

    Device toDevice(DeviceModel deviceModel);
}
