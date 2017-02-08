package com.cs544.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Registration;
import com.cs544.entity.Student;

public interface StudentService {
	
	public Student get(long id);
	public Student findByName(String name);
	public Student findByBarCode(String barCode);
	public List<CourseOffering> getCourseOfferingListForStudent(Long studentId);
	public List<AttendanceRecord> getAttendanceRecordForCourseOffering(List<CourseOffering> CourseOfferingList);
}	
