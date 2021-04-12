package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;



import com.nt.id.PrgmrProjId;

import lombok.Data;
@Data
@Entity
public class Programmer_Project implements Serializable {

	@EmbeddedId
	private PrgmrProjId id;//has-a Realation
	@Column(length = 20)
	private String prgmrName;
	private Integer age;
	@Column(length = 20)
	private String projName;
	private Integer teamSize;
}
