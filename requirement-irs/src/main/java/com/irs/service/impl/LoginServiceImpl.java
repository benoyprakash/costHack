package com.irs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irs.repository.LoginRepository;
import com.irs.service.ILoginService;


@Service
public class LoginServiceImpl  implements ILoginService{
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public String authenticateUser(String username, String password) {
		return loginRepository.authenticate(username, password);
	}

}
