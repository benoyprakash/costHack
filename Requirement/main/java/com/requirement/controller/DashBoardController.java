package com.requirement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"user"})
public class DashBoardController {
	
	@RequestMapping(value="/newrequirement" , method = RequestMethod.GET)
	public String addNewRequirement(ModelMap model){
		
		return "pages/forms";
	}
	
	@RequestMapping(value="/requirement/process" , method = RequestMethod.GET)
	public String getRequirement(ModelMap model, HttpServletRequest request){
		
		
		
		return "pages/forms";
	}
	


}
