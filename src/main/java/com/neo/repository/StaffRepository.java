package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.dto.LoginDto;

import com.neo.model.Staff;

public interface StaffRepository  extends JpaRepository<Staff, Long>{
	
	Staff findByLogin (LoginDto login);

}
