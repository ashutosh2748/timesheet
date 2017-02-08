package com.cs544.service;

import java.util.List;

import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Student;


public interface AttendanceRecordService {
	public List<AttendanceRecord> getallAttendance();

	public List<AttendanceRecord> getAttendanceBycourseofferingId(Long courseOfferingId);

	List<Student> getStudentsBycourseofferingId(Long courseOfferingId);
	
	
}	
