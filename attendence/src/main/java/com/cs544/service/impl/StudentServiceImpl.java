package com.cs544.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.dao.StudentDAO;
import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Location;
import com.cs544.entity.Student;
import com.cs544.service.StudentService;
import  com.cs544.dao.CourseOfferingDAO;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private CourseOfferingDAO courseOfferingDAO;
	
	
	@Override
	public Student get(long id) {
		Student student = studentDAO.findOne(id);
		return student;
	}

	@Override
	public Student findByName(String name) {
		// TODO Auto-generated method stub
	//	Student student=studentDAO.findAll();
		return null;
	}

	@Override
	public Student findByBarCode(String barCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseOffering> getCourseOfferingListForStudent(Long studentId) {
			List<com.cs544.entity.Registration> reg = new ArrayList();
			reg = studentDAO.findOne(studentId).getRegistrationList();
			ArrayList<CourseOffering> courseOfferingList = new ArrayList();
			for(com.cs544.entity.Registration registration: reg){
				courseOfferingList.add(registration.getCourseOffering1());
			}
		return courseOfferingList;
	}

	@Override
	public List<AttendanceRecord> getAttendanceRecordForCourseOffering(List<CourseOffering> CourseOfferingList) {
		ArrayList<Location> locationList = new ArrayList();
		for(CourseOffering co: CourseOfferingList){
			locationList.add(co.getLocation());
		}
		ArrayList<AttendanceRecord> attendanceRecordList = new ArrayList();
		for(int i=0; i<locationList.size(); i++){
			for(int j=0;j<locationList.get(i).getAttendanceRecord().size(); j++){
				attendanceRecordList.add(locationList.get(i).getAttendanceRecord().get(j));
			}
			
		}	
		return attendanceRecordList;
	}

	
	
	
	
	
	
}
