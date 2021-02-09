package com.nt.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
public class CallerTune implements Serializable{
private Integer callertuneId;
private String callertuneName;
private String provider;
private Long mobileNo;
private Timestamp lastUpdated;

}
