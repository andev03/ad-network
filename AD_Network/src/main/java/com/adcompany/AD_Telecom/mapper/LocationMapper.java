package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Location;
import com.adcompany.AD_Telecom.model.LocationModel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {DistrictMapper.class, ProvinceMapper.class, CityMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LocationMapper {

    @Mapping(source = "provinceId.provinceName", target = "provinceName")
    @Mapping(source = "cityId.cityName", target = "cityName")
    @Mapping(source = "districtId.districtName", target = "districtName")
    LocationModel toLocationModel(Location location);

    @InheritInverseConfiguration(name = "toLocationModel")
    Location toLocation(LocationModel locationModel);
}
