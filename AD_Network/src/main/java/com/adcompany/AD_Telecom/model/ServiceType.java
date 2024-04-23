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
@Table(name = "ServiceType")
public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceTypeId;

    private String serviceTypeName;

    private String description;

    @JsonBackReference
    @OneToMany(mappedBy = "serviceTypeId")
    private List<Service> services;

    public ServiceType(String serviceTypeName, String description) {
        this.serviceTypeName = serviceTypeName;
        this.description = description;
    }

    public void add(Service tempService) {
        if (services == null) {
            services = new ArrayList<>();
        }

        services.add(tempService);

        tempService.setServiceTypeId(this);
    }
}
