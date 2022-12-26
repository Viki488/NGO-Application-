package com.neo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.dto.LoginDto;
import com.neo.model.Login;
import com.neo.repository.LoginRepository;
import com.neo.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginRepository loginRepository ;
	
	@Autowired
	private ModelMapper modelMapper ;

	@Override
	public LoginDto getLogin(String LoginUsername, String Loginpassword) {
		Login login = this.loginRepository.getByLoginUsernameAndLoginPassword(LoginUsername, Loginpassword);
		return this.modelMapper.map(login, LoginDto.class);
	}

}
