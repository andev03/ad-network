package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor(force = true)
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locationId;

    @OneToOne
    @JoinColumn(name = "provinceId", referencedColumnName = "provinceId")
    private Province provinceId;

    @OneToOne
    @JoinColumn(name = "cityId", referencedColumnName = "cityId")
    private City cityId;

    @OneToOne
    @JoinColumn(name = "districtId", referencedColumnName = "districtId")
    private District districtId;

    private String locationDetail;

    public Location(Province provinceId, City cityId, District districtId, String locationDetail) {
        this.provinceId = provinceId;
        this.cityId = cityId;
        this.districtId = districtId;
        this.locationDetail = locationDetail;
    }
}
