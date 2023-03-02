package com.example.flight.be;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight")
public class FlightBE {

	
	private static final long serialVersionUID = -6108541353363012056L;

	@Id
	@Column(name = "flight_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;
	
	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "dept_port")
	private String deptPort;
	
	@Column(name = "arrv_port")
	private String arrvPort;
	
	@Column(name = "dept_time")
	private Timestamp deptTime;
	
	@Column(name = "arrv_time")
	private Timestamp arrvTime;

	/**
	 * @return the flightId
	 */
	public Integer getFlightId() {
		return flightId;
	}

	/**
	 * @param flightId the flightId to set
	 */
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

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
	 * @return the deptPort
	 */
	public String getDeptPort() {
		return deptPort;
	}

	/**
	 * @param deptPort the deptPort to set
	 */
	public void setDeptPort(String deptPort) {
		this.deptPort = deptPort;
	}

	/**
	 * @return the arrvPort
	 */
	public String getArrvPort() {
		return arrvPort;
	}

	/**
	 * @param arrvPort the arrvPort to set
	 */
	public void setArrvPort(String arrvPort) {
		this.arrvPort = arrvPort;
	}

	/**
	 * @return the deptTime
	 */
	public Timestamp getDeptTime() {
		return deptTime;
	}

	/**
	 * @param deptTime the deptTime to set
	 */
	public void setDeptTime(Timestamp deptTime) {
		this.deptTime = deptTime;
	}

	/**
	 * @return the arrvTime
	 */
	public Timestamp getArrvTime() {
		return arrvTime;
	}

	/**
	 * @param arrvTime the arrvTime to set
	 */
	public void setArrvTime(Timestamp arrvTime) {
		this.arrvTime = arrvTime;
	}
	
	

}
