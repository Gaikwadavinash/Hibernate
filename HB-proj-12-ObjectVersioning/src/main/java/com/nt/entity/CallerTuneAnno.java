package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="CallerTune_Anno")
public class CallerTuneAnno implements Serializable{
@Id
@GeneratedValue
@Type(type ="int")
private Integer callertuneId;

@Type(type ="string" )
@Column(length = 20)
private String callertuneName;

@Type(type ="string" )
@Column(length = 20)
private String provider;

@Type(type = "long")
private Long mobileNo;

@Version//version property
@Type(type = "int")
private Integer callertuneCount;//for versioning
}
