package com.irctcResourceApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Passenger {

	@Id
	private int pId;
	
	private String pName;
	
	private String plname;
	
	private String pfrom;
	
	private String pto;
	
	private String doj;
	
}
