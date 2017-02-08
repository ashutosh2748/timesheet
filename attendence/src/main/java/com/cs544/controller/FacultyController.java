package com.cs544.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs544.business.Report;
import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;
import com.cs544.service.AttendanceRecordService;
import com.cs544.service.CourseOfferingService;
import com.cs544.service.CourseService;
import com.cs544.service.StudentService;
import com.cs544.service.impl.AttendenceReporter;

@Controller
@RequestMapping("/faculty")
public class FacultyController {

	@Autowired
	private AttendenceReporter attenreport;
	@Autowired
	private AttendanceRecordService attendservice;
	@Autowired 
	CourseService courseservice;
	@Autowired
	CourseOfferingService courseofferingservice;

	@RequestMapping(value = "")
	public String dashboard(Model model) {
		model.addAttribute("page_title", "Faculty-Home");
		List<Course> courses=courseservice.getallCourse();
		model.addAllAttributes(courses);
		return "faculty/home";
	}
	@RequestMapping(value = "/{courseid}")
	public String dashboard(Model model,@PathVariable long courseid) {
		model.addAttribute("page_title", "Faculty-Home");
		List<CourseOffering> courseoffering=courseofferingservice.getCourseOffering(courseid);
		model.addAllAttributes(courseoffering);
		System.out.println(courseoffering);
		
		return "faculty/home";
	}
	@RequestMapping(value = "/courseoffering/{courseofferingid}")
	public String dashwithrecords(Model model,@PathVariable long courseofferingid) {
		model.addAttribute("page_title", "Faculty-Home");
		
		List<Report> reports=attenreport.generateReport(courseofferingid);
		model.addAllAttributes(reports);
		System.out.println(reports.toString());
		System.out.println(reports);
		
		return "faculty/home";
	}

	@RequestMapping(value = "/attendance-records")
	public String getrecords(Model model) {
		List<AttendanceRecord> records = attendservice.getallAttendance();
		model.addAllAttributes(records);
		System.out.println(records.toString());
		return "faculty/attendancerecords";
	}
	
//test
}
