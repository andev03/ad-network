package com.adcompany.AD_Telecom.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor(force = true)
@ToString
// No serializable hibernateLazyInitializer and handler to avoid InvalidDefinitionException of Lazy loading
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
