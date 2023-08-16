package com.Montek.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Montek.Entities.Login;


public interface Login_Repository extends JpaRepository<Login, Long> {
	
	Login findByEmail(String email);

}
