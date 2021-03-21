package com.shraddha.flyaway.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shraddha.flyaway.Model.Reservation;


public interface ReservtionRepos extends JpaRepository<Reservation, Long> {

}
