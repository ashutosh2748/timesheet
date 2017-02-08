package com.cs544.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(@Valid @RequestParam(value = "error", required = false) String error, Model model) {
		
		return "login";
	}
}
