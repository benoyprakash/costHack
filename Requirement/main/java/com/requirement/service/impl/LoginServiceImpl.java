package com.requirement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.requirement.dao.LoginRepository;
import com.requirement.service.ILoginService;

@Service
public class LoginServiceImpl  implements ILoginService{
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public String authenticateUser(String username, String password) {
		return loginRepository.authenticate(username, password);
	}

}
