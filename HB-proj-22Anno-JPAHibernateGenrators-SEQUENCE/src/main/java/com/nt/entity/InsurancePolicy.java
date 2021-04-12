package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="InsurancePolicy_Genrator" )
public class InsurancePolicy implements Serializable {
//@Id
//@GeneratedValue(strategy = GenerationType.SEQUENCE )
@Id
@SequenceGenerator(name ="gen1",sequenceName = "POLICYID_SEQ",
initialValue =50 ,allocationSize = 5)
@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
private Long policyId;
private String policyName;
private String company;
private Float tenure;
}
