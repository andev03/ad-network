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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cityId"})
@Entity
@Table(name = "District")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int districtId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId", referencedColumnName = "cityId")
    private City cityId;

    private String districtName;

    public District(City cityId, String districtName) {
        this.cityId = cityId;
        this.districtName = districtName;
    }
}
