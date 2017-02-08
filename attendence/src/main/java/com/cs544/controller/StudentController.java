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
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@RequestMapping("")
	public String home() {
		return "student/home";
	}
	
	@RequestMapping(value = "/{id}/courseofferings")
	public String courseOfferings(@PathVariable long id,Model model){
		List<CourseOffering> courseofferings = studentservice.getCourseOfferingListForStudent(id);
		System.out.println("calledI");
		for(CourseOffering cs:courseofferings){
			System.out.println(cs.getCourse().getDescription());
		}
		model.addAttribute("courseofferings", courseofferings);
		return "student/courseOffering";
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String studentDetail(@PathVariable long id, Model model) {
		Student student = studentservice.get(id);
		model.addAttribute("student", student);
		return "student/studentDetail";
	}
	
	
}
