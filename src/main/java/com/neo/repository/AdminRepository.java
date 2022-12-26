package com.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.neo.dto.LoginDto;
import com.neo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
	
	Admin findByLogin(LoginDto loginDto);

}
