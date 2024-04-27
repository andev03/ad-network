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
@Table(name = "ContractStatus")
public class ContractStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractStatusId;

    private String contractStatusName;

    @JsonBackReference
    @OneToMany(mappedBy = "contractId")
    private List<Contract> contractId;

    public ContractStatus(String contractStatusName) {
        this.contractStatusName = contractStatusName;
    }

    public void addContract(Contract tempContract) {
        if (contractId == null) {
            contractId = new ArrayList<>();
        }

        contractId.add(tempContract);
        tempContract.setContractStatusId(this);
    }
}
