package com.irs.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

public interface HomeService {

	public ModelAndView homePage(HttpServletRequest request);
}
