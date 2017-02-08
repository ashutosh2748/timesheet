package com.cs544.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value = "")
	public String dashboard(Model model) {
		model.addAttribute("page_title", "Admin Dashboard");
		return "admin/home";
	}

}
