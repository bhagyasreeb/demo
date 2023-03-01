package com.example.flight.dto;

import java.sql.Timestamp;

public class FlightDetails {
	private String flightNumber;
	private String departurePort;
	private String arrivalPort;
	private Timestamp departureTime;
	private Timestamp arrivalTime;
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the departurePort
	 */
	public String getDeparturePort() {
		return departurePort;
	}
	/**
	 * @param departurePort the departurePort to set
	 */
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	/**
	 * @return the arrivalPort
	 */
	public String getArrivalPort() {
		return arrivalPort;
	}
	/**
	 * @param arrivalPort the arrivalPort to set
	 */
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	/**
	 * @return the departureTime
	 */
	public Timestamp getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arrivalTime
	 */
	public Timestamp getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
}
