package com.neo.service;

import java.util.List;

import com.neo.dto.LoginDto;
import com.neo.dto.PartnerDto;

public interface PartnerService {

	PartnerDto savePartner(PartnerDto partnerDto);
	
	PartnerDto updatePartner(PartnerDto partnerDto,Long partnerId);
	
	List<PartnerDto>getAllPartner();
	
	void deletePartner(Long partnerId);
	
	PartnerDto getByPartnerLogin(LoginDto loginDto);
	

}
