package com.example.flight.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.flight.be.FlightBE;
import com.example.flight.dto.FlightDetails;
@Repository
public interface IFlightRepository extends JpaRepository<FlightBE, Long> {

	@Query("select a from flight a where TRUNC(a.dept_time)= TRUNC(?)")
    List<FlightDetails> getFlightDetailsByDate(Date date);

	@Query("SELECT a FROM flight a WHERE UPPER(a.flight_number) LIKE UPPER(%:airlineCode%)")
	List<FlightDetails> searchByAirLineCodeLike(@Param("airlineCode") String airlineCode);
	
}
