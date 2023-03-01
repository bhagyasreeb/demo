package com.example.flight.dto;

import java.util.List;

public class FlightDTO {

	private List<FlightDetails> flights;

	/**
	 * @return the flights
	 */
	public List<FlightDetails> getFlights() {
		return flights;
	}

	/**
	 * @param flights the flights to set
	 */
	public void setFlights(List<FlightDetails> flights) {
		this.flights = flights;
	}
	
	
}
