package com.cs544.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.dao.StudentDAO;
import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Location;
import com.cs544.entity.Student;
import com.cs544.service.CourseService;
import com.cs544.service.StudentService;
import com.cs544.dao.CourseDAO;
import  com.cs544.dao.CourseOfferingDAO;
@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Autowired
	private CourseDAO courseDAO;
	
	
	@Override
	public List<Course> getallCourse() {
		// TODO Auto-generated method stub
		Iterable<Course> courselistitr=courseDAO.findAll();
		List<Course> courselist=new ArrayList();
		for(Course item:courselistitr){
			courselist.add(item);
		}
		return courselist;
	}
	
	
	
	
	
	
	
	
	
}
