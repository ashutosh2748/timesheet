package com.cs544.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs544.entity.Student;
import com.cs544.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/")
	public String defaultPage() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/studentdetail/{id}", method = RequestMethod.GET)
	public String studentDetail(@PathVariable int id, Model model) {
		Student student = studentservice.get(id);
		model.addAttribute("student", student);
		return "studentDetail";
	}
}
