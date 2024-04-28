package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Employee;
import com.adcompany.AD_Telecom.entity.Location;
import com.adcompany.AD_Telecom.entity.Status;
import com.adcompany.AD_Telecom.model.EmployeeModel;
import com.adcompany.AD_Telecom.model.LocationModel;
import com.adcompany.AD_Telecom.model.StatusModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LocationMapper.class, StatusMapper.class, RolesMapper.class})
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface EmployeeMapper {

    @Mapping(target = "roleName", source = "roleId.roleName")
    @Mapping(target = "location", source = "locationId")
    @Mapping(target = "statusName", source = "statusId.statusName")
    EmployeeModel toEmployeeModel(Employee employee);

    @InheritInverseConfiguration(name = "toEmployeeModel")
    Employee toEmployee(EmployeeModel employeeModel);

    List<EmployeeModel> toEmployeeModelList(List<Employee> employeeList);

    List<Employee> toEmployeeList(List<EmployeeModel> employeeModelList);
}
