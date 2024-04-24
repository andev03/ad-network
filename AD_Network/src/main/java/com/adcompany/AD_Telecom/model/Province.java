package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Province")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int provinceId;

    private String provinceName;

    @JsonBackReference
    @OneToMany(mappedBy = "cityId")
    private List<City> cityId;

    public Province(String provinceName) {
        this.provinceName = provinceName;
    }

    public void add(City tempCity){
        if (cityId == null){
            cityId = new ArrayList<>();
        }

        cityId.add(tempCity);
        tempCity.setProvinceId(this);
    }
}
