package com.adcompany.AD_Telecom.model;

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
@Table(name = "Device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deviceId;

    private String deviceName;

    private String deviceDetail;

    @JsonBackReference
    @OneToMany(mappedBy = "deviceId")
    private List<Service> services;

    public Device(String deviceName, String deviceDetail) {
        this.deviceName = deviceName;
        this.deviceDetail = deviceDetail;
    }

    public void add(Service tempService) {
        if (services == null) {
            services = new ArrayList<>();
        }

        services.add(tempService);

        tempService.setDeviceId(this);
    }
}
