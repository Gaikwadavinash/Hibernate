package com.nt.entity;

import java.io.Serializable;

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
private Integer callertuneCount;//for versioning
}
