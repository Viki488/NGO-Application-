package com.neo.service;

import java.util.List;

import com.neo.dto.DonarDto;
import com.neo.dto.LoginDto;

public interface DonarService {
	
	DonarDto saveDonar (DonarDto donarDto);
	
	DonarDto updateDonar (DonarDto donarDto,Long donarId);
	
	List<DonarDto> getAllDonar ();
	 
	void deleteDonar (Long donarId); 
	
	DonarDto getByDonarLogin(LoginDto loginDto);

}
