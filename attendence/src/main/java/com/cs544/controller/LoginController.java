package com.cs544.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs544.service.impl.SecurityService;

@Controller
public class LoginController {
	@Autowired
	private SecurityService securityService;
	
	@RequestMapping("/login")
	public String login(@Valid @RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		
		model.addAttribute("page_title", "Login");
		
		String role = securityService.hasRole();
		if (role.equals("ROLE_ADMIN")) {
			return "redirect:/admin";
		} else if (role.equals("ROLE_FACULTY")) {
			return "redirect:/faculty";
		} else if (role.equals("ROLE_STUDENT")) {
			return "redirect:/student";
		}
		
		if (error != null) {
			model.addAttribute("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addAttribute("msg", "You've been logged out successfully.");
		}
		return "login";
	}
}
