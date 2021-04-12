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
@TableGenerator(name = "gen1",table = "Insurance_Policy_Table",pkColumnName ="PK_COL",pkColumnValue ="POLICYID", valueColumnName = "VAL_COL",initialValue =1000,allocationSize = 5)
@GeneratedValue(generator ="gen1" ,strategy = GenerationType.TABLE)
//	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE)
private Long policyId;
private String policyName;
private String company;
private Float tenure;
}
