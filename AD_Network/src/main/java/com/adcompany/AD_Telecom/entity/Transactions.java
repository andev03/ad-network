package com.adcompany.AD_Telecom.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor(force = true)
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contractId", referencedColumnName = "contractId")
    private Contract contractId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paymentId", referencedColumnName = "paymentId")
    private Payment paymentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transStatusId", referencedColumnName = "transStatusId")
    private TransStatus transStatusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transTypeId", referencedColumnName = "transTypeId")
    private TransType transTypeId;

    private double transAmount;

    private Date transTime;

    public Transactions(Contract contractId, Payment paymentId, TransStatus transStatusId, TransType transTypeId, double transAmount, Date transTime) {
        this.contractId = contractId;
        this.paymentId = paymentId;
        this.transStatusId = transStatusId;
        this.transTypeId = transTypeId;
        this.transAmount = transAmount;
        this.transTime = transTime;
    }
}
