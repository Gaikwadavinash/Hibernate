package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="InsurancePolicy_Genrator" )
public class InsurancePolicy implements Serializable {
@Id
//@GeneratedValue(strategy = GenerationType.AUTO)
//	@Id
@GeneratedValue
private Long policyId;
private String policyName;
private String company;
private Float tenure;
}
