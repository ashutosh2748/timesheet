package com.cs544.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs544.entity.Student;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.AttendanceRecord;

public interface StudentService {
	
	public Student get(long id);
	public Student findByStudentId(String StudentId);
	public Student findByBarCode(String barCode);
	Student findByName(String name);
	public List<AttendanceRecord> getAttendanceRecords();
	public List<CourseOffering> getAllCourseOfferings();
	

}	
