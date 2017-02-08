package com.cs544.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;
import com.cs544.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("/dashboard")
	public String defaultPage() {
		return "redirect:/student";
	}
	
	@RequestMapping("/student")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "student/{id}/courseofferings")
	public String courseOfferings(@PathVariable long id,Model model){
		List<CourseOffering> courseofferings = studentservice.getCourseOfferingListForStudent(id);
		
		for(CourseOffering cs:courseofferings){
			System.out.println(cs.getCourse().getDescription());
		}
		model.addAttribute("courseofferings", courseofferings);
		return "courseOffering";
	}
	
	@RequestMapping(value = "/studentdetail/{id}", method = RequestMethod.GET)
	public String studentDetail(@PathVariable long id, Model model) {
		Student student = studentservice.get(id);
		model.addAttribute("student", student);
		return "studentDetail";
	}
	
	
}
