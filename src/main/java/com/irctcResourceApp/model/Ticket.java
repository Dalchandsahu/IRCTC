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

public class Ticket {

	@Id
	private long pnr;
	
	private String TickrtStatus;
	
	private  double ticketprice;
	
}
