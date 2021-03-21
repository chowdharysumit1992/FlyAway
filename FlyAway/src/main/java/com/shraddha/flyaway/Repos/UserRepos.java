package com.shraddha.flyaway.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shraddha.flyaway.Model.User;

public interface UserRepos extends JpaRepository<User, Long> {

}
