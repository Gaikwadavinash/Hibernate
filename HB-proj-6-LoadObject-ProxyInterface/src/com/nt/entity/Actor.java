package com.nt.entity;

public final class Actor implements IActor {
private Integer actorId;
private String actorName;
private String actorAddress;
private Long phoneNo;
private Float remuneration;
      public Actor() {
   System.out.println("0-Param Constructor:"+this.getClass().getSuperclass()); 	  
      }
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
//toString() Method
@Override
public String toString() {
	return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorAddr=" + actorAddress + ", phoneNo="
			+ phoneNo + ", remuneration=" + remuneration + "]";
}

}
