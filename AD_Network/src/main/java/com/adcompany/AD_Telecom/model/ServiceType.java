package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ServiceType")
public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serviceTypeId")
    private int serviceTypeId;

    @Column(name = "serviceTypeName")
    private String serviceTypeName;

    @JsonBackReference
    @OneToMany(mappedBy = "serviceTypeId")
    private List<Service> services;

    public ServiceType() {
    }

    public ServiceType(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void add(Service tempService) {
        if (services == null) {
            services = new ArrayList<>();
        }

        services.add(tempService);

        tempService.setServiceTypeId(this);
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "ServiceType{" +
                "serviceTypeId=" + serviceTypeId +
                ", serviceTypeName='" + serviceTypeName + '\'' +
                '}';
    }
}
