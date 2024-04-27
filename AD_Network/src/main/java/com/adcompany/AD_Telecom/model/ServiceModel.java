package com.adcompany.AD_Telecom.model;

import lombok.Data;

import java.util.List;

@Data
public class ServiceModel {

    private DeviceModel device;

    private ServiceTypeModel serviceType;

    private ServiceStatusModel serviceStatus;

    private double price;

    private String serviceName;

}
