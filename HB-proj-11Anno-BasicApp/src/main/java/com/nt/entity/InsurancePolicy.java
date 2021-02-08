package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Data
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Table(name="Insurance_Policy")
public class InsurancePolicy implements Serializable{
@Id
@Column(name ="Policy_Id",length =20)
private Long policyId;
@Column(name = "Policy_Name",length = 20)
private String policyName;
@Column(name = "company",length = 20)
private String company;
@Column(name ="tenure")
private float tenure;

}
