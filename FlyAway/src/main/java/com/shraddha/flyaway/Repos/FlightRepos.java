package com.shraddha.flyaway.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shraddha.flyaway.Model.Flight;



public interface FlightRepos extends JpaRepository<Flight, Long> {

}
