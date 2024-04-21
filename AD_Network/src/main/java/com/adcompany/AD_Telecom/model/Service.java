package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serviceId")
    private int serviceId;

    @ManyToOne
    @JoinColumn(name = "deviceId", referencedColumnName = "deviceId")
    private Device deviceId;

    @ManyToOne
    @JoinColumn(name = "serviceTypeId", referencedColumnName = "serviceTypeId")
    private ServiceType serviceTypeId;

    @ManyToOne
    @JoinColumn(name = "serviceStatusId", referencedColumnName = "serviceStatusId")
    private ServiceStatus serviceStatusId;

    @Column(name = "price")
    private double price;

    @Column(name = "serviceName")
    private String serviceName;

    public Service() {
    }

    public Service(Device deviceId, ServiceType serviceTypeId, ServiceStatus serviceStatusId, Double price, String serviceName) {
        this.deviceId = deviceId;
        this.serviceTypeId = serviceTypeId;
        this.serviceStatusId = serviceStatusId;
        this.price = price;
        this.serviceName = serviceName;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Device getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Device deviceId) {
        this.deviceId = deviceId;
    }

    public ServiceType getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(ServiceType serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public ServiceStatus getServiceStatusId() {
        return serviceStatusId;
    }

    public void setServiceStatusId(ServiceStatus serviceStatusId) {
        this.serviceStatusId = serviceStatusId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
