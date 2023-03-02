package com.example.flight.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.flight.dto.FlightDTO;
import com.example.flight.dto.FlightDetails;

@Service
public interface IFlightService {
	public FlightDTO getFlightDetailsByDate(Date date);
	public FlightDTO searchByAirLineCodeLike(String airlineCode);
	public void saveFlightDetails(FlightDetails flightDetails);
}
