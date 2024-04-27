package com.adcompany.AD_Telecom.entity;

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

    @JsonBackReference
    @OneToMany(mappedBy = "empId")
    private List<Employee> empId;

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

    private void addEmployee(Employee tempEmployee){
        if (empId == null) {
            empId = new ArrayList<>();
        }
        empId.add(tempEmployee);
        tempEmployee.setStatusId(this);
    }
}
