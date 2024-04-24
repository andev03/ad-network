package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "Status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusId;

    private String statusName;

    @JsonBackReference
    @OneToMany(mappedBy = "cusId")
    private List<Customer> cusId;

    public Status(String statusName) {
        this.statusName = statusName;
    }

    private void addCustomer(Customer tempCustomer){
        if (cusId == null) {
            cusId = new ArrayList<>();
        }
        cusId.add(tempCustomer);
        tempCustomer.setStatusId(this);
    }
}
