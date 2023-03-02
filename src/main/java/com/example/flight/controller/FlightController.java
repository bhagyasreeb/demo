package com.example.flight.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight.dto.FlightDTO;
import com.example.flight.dto.FlightDetails;
import com.example.flight.service.IFlightService;


@RestController
public class FlightController {
	@Autowired
	private IFlightService flightService;
	
	@RequestMapping(value = "/flights", produces = "application/json", method = RequestMethod.GET)
	public FlightDTO getFlights() {
		return flightService.getFlightDetailsByDate(new Date());
	
	}
	
	@RequestMapping(value = "/flights", produces = "application/json", method = RequestMethod.GET)
	public FlightDTO getFlights(@RequestParam(name="airlineCode",required=true) String airlineCode) {
		return flightService.searchByAirLineCodeLike(airlineCode);
	
	}
	
	@RequestMapping(value = "/saveFlights", consumes = "application/json", method = RequestMethod.POST)
	public ResponseEntity<String> saveFlights(@RequestBody FlightDetails flightDetails) {
		flightService.saveFlightDetails(flightDetails);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
