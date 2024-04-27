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
@Table(name = "ContractType")
public class ContractType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractTypeId;

    private String contractTypeName;

    @JsonBackReference
    @OneToMany(mappedBy = "contractId")
    private List<Contract> contractId;

    public ContractType(String contractTypeName) {
        this.contractTypeName = contractTypeName;
    }

    public void addContract(Contract tempContract){
        if (contractId == null){
            contractId = new ArrayList<>();
        }

        contractId.add(tempContract);
        tempContract.setContractTypeId(this);
    }
}
