package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Province;
import com.adcompany.AD_Telecom.model.ProvinceModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProvinceMapper {

    ProvinceModel toProvinceModel(Province province);

    Province toProvince(ProvinceModel provinceModel);
}
