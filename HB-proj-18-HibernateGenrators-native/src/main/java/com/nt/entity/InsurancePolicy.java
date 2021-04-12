package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class InsurancePolicy implements Serializable {

private Long policyId;
private String policyName;
private String company;
private Float tenure;
}
