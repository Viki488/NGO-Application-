package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.dto.LoginDto;
import com.neo.model.Partner;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
	
	Partner findByLogin(LoginDto loginDto);

}
