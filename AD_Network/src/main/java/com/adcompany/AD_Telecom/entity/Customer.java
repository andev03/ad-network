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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "contractId"})
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cusId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private Location locationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId", referencedColumnName = "statusId")
    private Status statusId;

    @Column(unique = true)
    private String phoneNumber;

    private String firstName;

    private String lastName;

    private String password;

    @JsonBackReference
    @OneToMany(mappedBy = "contractId")
    private List<Contract> contractId;

    public Customer(Location locationId, Status statusId, String phoneNumber, String firstName, String lastName, String password) {
        this.locationId = locationId;
        this.statusId = statusId;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public void addContract(Contract tempContract) {
        if (contractId == null) {
            contractId = new ArrayList<>();
        }

        contractId.add(tempContract);
        tempContract.setCusId(this);
    }
}
