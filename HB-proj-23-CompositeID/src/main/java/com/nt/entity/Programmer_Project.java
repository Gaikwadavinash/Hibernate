package com.nt.entity;

import java.io.Serializable;

import com.nt.id.PrgmrProjId;

import lombok.Data;
@Data
public class Programmer_Project implements Serializable {
//has-a Realation
	private PrgmrProjId id;
	private String prgmrName;
	private Integer age;
	private String projName;
	private Integer teamSize;
}
