package com.irctcResourceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.irctcResourceApp.model.Passenger;
import com.irctcResourceApp.model.Ticket;
import com.irctcResourceApp.service.passengerService;

@RestController
public class PassengerController {

	@Autowired
	private passengerService PassengerService;
	
	@PostMapping(value = "/BookTicket" ,produces = "application/json", consumes = "application/json")
	public ResponseEntity<Ticket> bookeTicket(@RequestBody Passenger pId){
		Ticket bookTicket = PassengerService.bookTicket(pId);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);
		
	}
}
