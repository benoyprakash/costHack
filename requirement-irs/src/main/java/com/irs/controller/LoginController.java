package com.irs.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.irs.info.User;
import com.irs.service.ILoginService;


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
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, HttpServletRequest request) {

		System.out.println(user.getUserName() + " / " + user.getPassword());
		String role = loginService.authenticateUser(user.getUserName(),
				user.getPassword());
		if(role == null){
			return "redirect:/";
		}
		request.getSession().setAttribute("currentUser", user);
		return "pages/index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginget(HttpServletRequest request) {

			return "pages/index";
	}
	


}