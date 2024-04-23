package com.adcompany.AD_Telecom.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locationId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provinceId", referencedColumnName = "provinceId")
    private Province provinceId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId", referencedColumnName = "cityId")
    private City cityId;

    @OneToOne(fetch = FetchType.LAZY)
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
