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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "transactionId"})
@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    private String paymentName;

    @JsonBackReference
    @OneToMany(mappedBy = "transactionId")
    private List<Transactions> transactionId;

    public Payment(String paymentName) {
        this.paymentName = paymentName;
    }

    public void addTransaction(Transactions tempTransaction){
        if (transactionId == null){
            transactionId = new ArrayList<>();
        }

        transactionId.add(tempTransaction);
        tempTransaction.setPaymentId(this);
    }
}
