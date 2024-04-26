package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor(force = true)
@ToString
@Entity
@Table(name = "Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deviceId", referencedColumnName = "deviceId")
    private Device deviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serviceTypeId", referencedColumnName = "serviceTypeId")
    private ServiceType serviceTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serviceStatusId", referencedColumnName = "serviceStatusId")
    private ServiceStatus serviceStatusId;

    private double price;

    private String serviceName;

    public Service(Device deviceId, ServiceType serviceTypeId, ServiceStatus serviceStatusId, double price, String serviceName) {
        this.deviceId = deviceId;
        this.serviceTypeId = serviceTypeId;
        this.serviceStatusId = serviceStatusId;
        this.price = price;
        this.serviceName = serviceName;
    }
}
