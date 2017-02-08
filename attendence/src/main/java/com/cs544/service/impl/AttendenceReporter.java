package com.cs544.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cs544.dao.AttendanceRecordDAO;
import com.cs544.dao.CourseDAO;
import com.cs544.dao.CourseOfferingDAO;
import com.cs544.dao.StudentDAO;

public class AttendenceReporter {

	@Autowired
	private CourseDAO courseDAO;
	@Autowired
	private CourseOfferingDAO courseofferingdao;
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private AttendanceRecordDAO attendanceDAO;
	
	
	

}
