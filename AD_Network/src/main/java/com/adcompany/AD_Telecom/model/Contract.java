package com.adcompany.AD_Telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor(force = true)
@ToString
@Entity
@Table(name = "Contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cusId", referencedColumnName = "cusId")
    private Customer cusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empId", referencedColumnName = "empId")
    private Employee empId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractTypeId", referencedColumnName = "contractTypeId")
    private ContractType contractTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractStatusId", referencedColumnName = "contractStatusId")
    private ContractStatus contractStatusId;

    private Date startDate;

    private Date endDate;

    private int renewalCount;

    public Contract(Customer cusId, Employee empId, ContractType contractTypeId, ContractStatus contractStatusId, Date startDate, Date endDate, int renewalCount) {
        this.cusId = cusId;
        this.empId = empId;
        this.contractTypeId = contractTypeId;
        this.contractStatusId = contractStatusId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.renewalCount = renewalCount;
    }
}
