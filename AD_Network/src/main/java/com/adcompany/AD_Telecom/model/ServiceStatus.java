package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ServiceStatus")
public class ServiceStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceStatusId;

    private String serviceStatusName;

    @JsonBackReference
    @OneToMany(mappedBy = "serviceStatusId")
    private List<Service> services;

    public ServiceStatus(String serviceStatusName) {
        this.serviceStatusName = serviceStatusName;
    }

    public void add(Service tempService) {
        if (services == null) {
            services = new ArrayList<>();
        }

        services.add(tempService);

        tempService.setServiceStatusId(this);
    }
}
