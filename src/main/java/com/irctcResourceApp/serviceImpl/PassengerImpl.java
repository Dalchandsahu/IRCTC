package com.irctcResourceApp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctcResourceApp.Repository.PassengerRepo;
import com.irctcResourceApp.model.Passenger;
import com.irctcResourceApp.model.Ticket;
import com.irctcResourceApp.service.passengerService;

@Service
public class PassengerImpl implements passengerService {

	@Autowired
	private PassengerRepo  passengerRepo;

	@Override
	public Ticket bookTicket(Passenger psg) {
		Passenger passenger = passengerRepo.save(psg);
		if(passenger != null) {
			Ticket t = new Ticket();
			t.setPnr(12344582);
			t.setTickrtStatus("Booked");
			t.setTicketprice(763.980);
			return t;
		}else {
		return null;
	}
	}
}
