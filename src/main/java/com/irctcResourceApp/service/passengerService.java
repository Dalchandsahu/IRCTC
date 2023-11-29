package com.irctcResourceApp.service;

import com.irctcResourceApp.model.Passenger;
import com.irctcResourceApp.model.Ticket;

public interface passengerService {

	// create passenger
	
	public Ticket bookTicket(Passenger psg);
}
