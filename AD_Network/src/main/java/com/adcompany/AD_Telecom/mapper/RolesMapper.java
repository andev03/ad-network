package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Roles;
import com.adcompany.AD_Telecom.model.RolesModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RolesMapper {
    RolesModel toRolesModel(Roles roles);

    Roles toRoles(RolesModel rolesModel);
}
