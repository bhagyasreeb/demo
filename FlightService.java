package com.example.flight.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.flight.be.FlightBE;
import com.example.flight.dto.FlightDTO;
import com.example.flight.dto.FlightDetails;
import com.example.flight.repository.IFlightRepository;

public class FlightService implements IFlightService {
	@Autowired
	private IFlightRepository iFlightRepository;

	@Override
	public FlightDTO getFlightDetailsByDate(Date date) {
		FlightDTO flightDTO=new FlightDTO();
		List<FlightDetails> flightDetails= iFlightRepository.getFlightDetailsByDate(date);
		flightDTO.setFlights(flightDetails);
		return flightDTO;
	}

	@Override
	public FlightDTO searchByAirLineCodeLike(String airlineCode) {
		FlightDTO flightDTO=new FlightDTO();
		List<FlightDetails> flightDetails= iFlightRepository.searchByAirLineCodeLike(airlineCode);
		flightDTO.setFlights(flightDetails);
		return flightDTO;
	}

	@Override
	public void saveFlightDetails(FlightDetails flightDetails) {
		FlightBE flightBE=convertFlightDetailsToBE(flightDetails);
		iFlightRepository.save(flightBE);
	}
	
	private FlightBE convertFlightDetailsToBE(FlightDetails flightDetails) {
		FlightBE flightBE=new FlightBE();
		flightBE.setFlightNumber(flightDetails.getFlightNumber());
		flightBE.setDeptPort(flightDetails.getDeparturePort());
		flightBE.setArrvPort(flightDetails.getArrivalPort());
		flightBE.setDeptTime(flightDetails.getDepartureTime());
		flightBE.setArrvTime(flightDetails.getArrivalTime());
		return flightBE;

	}

}
