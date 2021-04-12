package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="InsurancePolicy_Genrator" )
public class InsurancePolicy implements Serializable {
@Id
//To specify details HB Specific generator
@GenericGenerator(name ="gen1",strategy = "increment")
//To apply generators on @Id field
@GeneratedValue(generator = "gen1")
private Long policyId;
private String policyName;
private String company;
private Float tenure;
}
