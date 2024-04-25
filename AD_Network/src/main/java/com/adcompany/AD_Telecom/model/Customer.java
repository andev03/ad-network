package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor(force = true)
@ToString
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cusId;

    @OneToOne
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private Location locationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statusId", referencedColumnName = "statusId")
    private Status statusId;

    @Column(unique = true)
    private String phoneNumber;

    private String firstName;

    private String lastName;

    @JsonIgnore
    private String password;


    public Customer(Location locationId, Status statusId, String phoneNumber, String firstName, String lastName, String password) {
        this.locationId = locationId;
        this.statusId = statusId;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}
