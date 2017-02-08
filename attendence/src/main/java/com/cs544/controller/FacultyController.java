package com.cs544.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs544.business.Report;
import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.service.AttendanceRecordService;
import com.cs544.service.CourseOfferingService;
import com.cs544.service.CourseService;
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
		List<Course> courses = courseservice.getallCourse();
		model.addAttribute("courses", courses);
		return "faculty/home";
	}

	@RequestMapping(value = "/course-offerings/{courseid}")
	public String courseofferings(Model model, @PathVariable long courseid) {
		model.addAttribute("page_title", "Faculty- Course Offerings");
		List<CourseOffering> courseoffering = courseofferingservice.getCourseOffering(courseid);
		model.addAttribute("courseoffering", courseoffering);
		return "faculty/offerings";
	}

	@RequestMapping(value = "/course-offerings/report/{courseofferingid}")
	public String dashwithrecords(Model model, @PathVariable long courseofferingid) {
		model.addAttribute("page_title", "Faculty- Course Offering - Report");
		List<Report> reports = attenreport.generateReport(courseofferingid);
		model.addAttribute("reports", reports);
		return "faculty/report";
	}
	
	@RequestMapping(value = "course-offerings/sessions/{courseofferingid}")
	public String courseOfferSessions(Model model, @PathVariable long courseofferingid){
		model.addAttribute("page_title", "Faculty- Course Offering - Sessions");
		
		
		return "faculty/session";
	}

	@RequestMapping(value = "/attendance-records")
	public String getrecords(Model model) {
		List<AttendanceRecord> records = attendservice.getallAttendance();
		model.addAllAttributes(records);
		System.out.println(records.toString());
		return "faculty/attendancerecords";
	}
	
	
	
	

}
