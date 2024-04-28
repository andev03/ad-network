package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.City;
import com.adcompany.AD_Telecom.entity.Province;
import com.adcompany.AD_Telecom.model.CityModel;
import com.adcompany.AD_Telecom.model.ProvinceModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityModel toCityModel(City city);

    City toCity(CityModel cityModel);
}
