package com.irs.service;

import org.springframework.stereotype.Component;

@Component
public interface ILoginService {

	public String authenticateUser(String username , String password);
}
