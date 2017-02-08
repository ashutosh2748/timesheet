package com.cs544.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.dao.CourseDAO;
import com.cs544.dao.CourseOfferingDAO;
import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.service.CourseOfferingService;
@Service
public class CourseOfferingServiceImpl implements CourseOfferingService{
	
	@Autowired
	private CourseOfferingDAO courseofferingdao;
	@Autowired
	private CourseDAO coursedao;
	
	@Override
	public List<Course> getallCourseOffering() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CourseOffering> getCourseOffering(long courseid) {
		Course course=coursedao.findOne(courseid);
		List<CourseOffering> courseofferinglist=course.getCourseOfferingList();
	return courseofferinglist;
	
	}

	@Override
	public CourseOffering getOneCourseOffering(long courseofferingId) {
		
		CourseOffering courseoffering=courseofferingdao.findOne(courseofferingId);// TODO Auto-generated method stub
		return courseoffering;
	}

}
