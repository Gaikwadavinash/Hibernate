package com.nt.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Data
@Entity
@Table(name ="CallerTune_Anno_TimeStamp_Vers")
public class CallerTune implements Serializable{
	@Id
@GeneratedValue
@Type(type = "int")
private Integer callertuneId;

@Column(length = 20)
@Type(type = "string")
private String callertuneName;

@Column(length = 20)
@Type(type = "string")
private String provider;

@Type(type = "long")
private Long mobileNo;

@Version
@Type(type = "int")
private int callertuneCount;

@CreationTimestamp
@Type(type = "timestamp")
private Timestamp createdOn;

@UpdateTimestamp
@Type(type ="timestamp")
private Timestamp lastUpdatedOn;
}
