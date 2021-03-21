package com.shraddha.flyaway.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shraddha.flyaway.Model.Passenger;


public interface PassengerRepos extends JpaRepository<Passenger, Long> {

}
