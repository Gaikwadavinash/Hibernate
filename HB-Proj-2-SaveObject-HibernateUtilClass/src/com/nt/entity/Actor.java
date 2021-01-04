package com.nt.entity;

public class Actor {
private int actorId;
private String actorName;
private String actorAddress;
private long phoneNo;
private float remuneration;
 public int getActorId() {
	return actorId;
}
public void setActorId(int actorId) {
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
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public float getRemuneration() {
	return remuneration;
}
public void setRemuneration(float remuneration) {
	this.remuneration = remuneration;
}
@Override
public String toString() {
	return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorAddress=" + actorAddress + ", phnoneNo="
			+ phoneNo + ", remuneration=" + remuneration + "]";
}

}



