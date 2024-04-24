package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "City")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provinceId", referencedColumnName = "provinceId")
    private Province provinceId;

    private String cityName;

    @JsonBackReference
    @OneToMany(mappedBy = "districtId")
    private List<District> districtId;

    public City(Province provinceId, String cityName) {
        this.provinceId = provinceId;
        this.cityName = cityName;
    }

    public void add(District tempDistrict){
        if (districtId == null){
            districtId = new ArrayList<>();
        }
        districtId.add(tempDistrict);
        tempDistrict.setCityId(this);
    }
}
