package com.irctcResourceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irctcResourceApp.model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
