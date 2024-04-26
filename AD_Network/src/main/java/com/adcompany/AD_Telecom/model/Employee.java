package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor(force = true)
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId", referencedColumnName = "statusId")
    private Status statusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private Roles roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private Location locationId;

    @Column(unique = true)
    private String email;

    private String firstName;

    private String lastName;

    @JsonIgnore
    private String password;

    private String phoneNumber;

    @JsonIgnore
    @JsonBackReference
    @OneToMany(mappedBy = "contractId")
    private List<Contract> contractId;

    public Employee(Status statusId, Roles roleId, Location locationId, String email, String firstName, String lastName, String password, String phoneNumber) {
        this.statusId = statusId;
        this.roleId = roleId;
        this.locationId = locationId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public void addContract(Contract tempContract){
        if (contractId == null){
            contractId = new ArrayList<>();
        }

        contractId.add(tempContract);
        tempContract.setEmpId(this);
    }
}
