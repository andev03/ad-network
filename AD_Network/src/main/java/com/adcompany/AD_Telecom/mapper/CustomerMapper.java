package com.adcompany.AD_Telecom.mapper;

import com.adcompany.AD_Telecom.entity.Customer;
import com.adcompany.AD_Telecom.model.CustomerModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {LocationMapper.class, StatusMapper.class})
public interface CustomerMapper {

    @Mapping(target = "statusName", source = "statusId.statusName")
    @Mapping(target = "location", source = "locationId")
    CustomerModel toCustomerModel(Customer customer);

    @InheritInverseConfiguration(name = "toCustomerModel")
    Customer toCustomer(CustomerModel customerModel);

    List<CustomerModel> toCustomerModelList(List<Customer> customerList);

    List<Customer> toCustomerList(List<CustomerModel> customerModelList);
}
