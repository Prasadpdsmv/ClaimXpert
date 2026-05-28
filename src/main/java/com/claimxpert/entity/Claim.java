
package com.claimxpert.entity;

import jakarta.persistence.*;

@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String claimId;
    private String claimantName;
    private String status;
    private Double amount;

    public Long getId(){return id;}
    public String getClaimId(){return claimId;}
    public void setClaimId(String claimId){this.claimId=claimId;}
    public String getClaimantName(){return claimantName;}
    public void setClaimantName(String c){this.claimantName=c;}
    public String getStatus(){return status;}
    public void setStatus(String s){this.status=s;}
    public Double getAmount(){return amount;}
    public void setAmount(Double a){this.amount=a;}
}
