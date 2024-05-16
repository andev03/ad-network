package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Roles;
import com.adcompany.AD_Telecom.model.RolesModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RolesMapper {
    RolesModel toRolesModel(Roles roles);

    Roles toRoles(RolesModel rolesModel);
}
