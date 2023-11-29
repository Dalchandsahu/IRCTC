package com.irctcResourceApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctcResourceApp.model.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
