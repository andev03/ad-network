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
@NoArgsConstructor(force = true)
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    private String roleName;

    @JsonBackReference
    @OneToMany(mappedBy = "empId")
    private List<Employee> empId;

    public Roles(String roleName) {
        this.roleName = roleName;
    }

    public void addEmployee(Employee tempEmpId){
        if (empId == null){
            empId = new ArrayList<>();
        }
        empId.add(tempEmpId);

        tempEmpId.setRoleId(this);
    }
}
