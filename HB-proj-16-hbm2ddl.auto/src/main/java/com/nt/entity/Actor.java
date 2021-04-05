package com.nt.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Actor  {
private Integer actorId;
private String actorName;
private String actorAddress;
private Long phoneNo;
private Float remuneration;
private String desg;
     
//Getter and Setters() Method
public Integer getActorId() {
	return actorId;
}
public void setActorId(Integer actorId) {
	this.actorId = actorId;
}
public String getActorName() {
	return actorName;
}
public void setActorName(String actorName) {
	this.actorName = actorName;
}
public String getActorAddress() {
	return actorAddress;
}
public void setActorAddress(String actorAddress) {
	this.actorAddress = actorAddress;
}
public Long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
}
public Float getRemuneration() {
	return remuneration;
}
public void setRemuneration(Float remuneration) {
	this.remuneration = remuneration;
}



}
