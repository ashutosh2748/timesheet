package com.cs544.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.dao.StudentDAO;
import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Location;
import com.cs544.entity.Registration;
import com.cs544.entity.Student;
import com.cs544.service.AttendanceRecordService;
import com.cs544.service.CourseService;
import com.cs544.service.StudentService;
import com.cs544.dao.AttendanceRecordDAO;
import com.cs544.dao.CourseDAO;
import  com.cs544.dao.CourseOfferingDAO;
@Service
public class AttendanceRecordServiceImpl implements AttendanceRecordService {
	
	
	@Autowired
	private AttendanceRecordDAO attendanceDAO;
	@Autowired
	private CourseOfferingDAO courseofferingDAO;
	
	
	@Override
	public List<AttendanceRecord> getallAttendance() {
		Iterable<AttendanceRecord> attendancelistitr=attendanceDAO.findAll();
		List<AttendanceRecord> attendancelist=new ArrayList();
		for(AttendanceRecord item:attendancelistitr){
			attendancelist.add(item);
		}
		return attendancelist;
	//	return null;
	}
	
	@Override
	public List<Student> getStudentsBycourseofferingId(Long courseOfferingId) {
		
		CourseOffering coffer=courseofferingDAO.findOne(courseOfferingId);
		List<Registration> reglist=coffer.getRegistration();
		List<Student>students =new ArrayList();
		for(Registration r:reglist){
			students.add(r.getStudent());
		}
		
		return students;
	//	return null;
	}

	@Override
	public List<AttendanceRecord> getAttendanceBycourseofferingId(Long courseOfferingId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
}
