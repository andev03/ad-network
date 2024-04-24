package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
// No serializable hibernateLazyInitializer and handler to avoid InvalidDefinitionException of Lazy loading
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
