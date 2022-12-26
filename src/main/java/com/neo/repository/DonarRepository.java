package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.dto.LoginDto;
import com.neo.model.Donar;

public interface DonarRepository  extends JpaRepository<Donar, Long> {
	
	Donar findByLogin(LoginDto loginDto);

}
