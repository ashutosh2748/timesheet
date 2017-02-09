package com.cs544.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs544.service.impl.SecurityService;

@Controller
public class HomeController {
	
	@Autowired
	private SecurityService securityService;

	@RequestMapping("/")
	public String home(Model model) {
		String role = securityService.hasRole();
		if (role.equals("ROLE_ADMIN")) {
			return "redirect:/admin";
		} else if (role.equals("ROLE_FACULTY")) {
			return "redirect:/faculty";
		} else if (role.equals("ROLE_STUDENT")) {
			return "redirect:/student";
		}

		return "welcome";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accesssDenied(Model model) {

		// check if user is logged in
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			model.addAttribute("username", userDetail.getUsername());
		}

		return "403";

	}
}
