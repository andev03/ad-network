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
