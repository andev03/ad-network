package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ServiceStatus")
public class ServiceStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serviceStatusId")
    private int serviceStatusId;

    @Column(name = "serviceStatusName")
    private String serviceStatusName;

    @JsonBackReference
    @OneToMany(mappedBy = "serviceStatusId")
    private List<Service> services;

    public ServiceStatus() {
    }

    public ServiceStatus(String serviceStatusName) {
        this.serviceStatusName = serviceStatusName;
    }

    public int getServiceStatusId() {
        return serviceStatusId;
    }

    public void setServiceStatusId(int serviceStatusId) {
        this.serviceStatusId = serviceStatusId;
    }

    public String getServiceStatusName() {
        return serviceStatusName;
    }

    public void setServiceStatusName(String serviceStatusName) {
        this.serviceStatusName = serviceStatusName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void add(Service tempService) {
        if (services == null) {
            services = new ArrayList<>();
        }

        services.add(tempService);

        tempService.setServiceStatusId(this);
    }

    @Override
    public String toString() {
        return "ServiceStatus{" +
                "serviceStatusId=" + serviceStatusId +
                ", serviceStatusName='" + serviceStatusName + '\'' +
                '}';
    }
}
