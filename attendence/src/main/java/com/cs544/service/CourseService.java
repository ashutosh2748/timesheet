package com.cs544.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Registration;
import com.cs544.entity.Student;

public interface CourseService {
	public List<Course> getallCourse();
	
	
}	
