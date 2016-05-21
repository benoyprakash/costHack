package com.requirement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.requirement.model.User;
import com.requirement.service.ILoginService;

@Controller
@SessionAttributes({ "user" })
public class LoginController {

	@Autowired
	ILoginService loginService;

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "pages/login";
	}

	/**
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("user") User user) {

		System.out.println(user.getUserName() + user.getPassword());
		String role = loginService.authenticateUser(user.getUserName(),
				user.getPassword());
		return "pages/index";
	}
	


}
