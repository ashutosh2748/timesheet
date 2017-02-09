package com.cs544.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;
import com.cs544.service.StudentService;
import com.cs544.service.impl.AttendenceReporter;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@Autowired
	private AttendenceReporter attenrp;
	
	@RequestMapping("")
	public String home(Model model) {
		String s_id = StudentId();
		List<CourseOffering> courseofferings = studentservice.getCourseOfferingListForStudent(s_id);
		model.addAttribute("courseofferings", courseofferings);
		return "student/home";
	}
	
	@RequestMapping(value = "/attendance/{courseOid}", method = RequestMethod.GET)
	public String courseOfferings(@PathVariable String s_id,Model model){
	//	List<CourseOffering> courseofferings = studentservice.getCourseOfferingListForStudent(id);
		Student s=studentservice.findByStudentId(s_id);
		System.out.println(s.getFirstName());
		
		//model.addAttribute("courseofferings", courseofferings);
		return "student/courseOffering";
	}
	
	public String StudentId(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserDetails userDetail = (UserDetails) auth.getPrincipal();
		return userDetail.getUsername();
	}
	
	
}
