package com.cs544.service;

import java.util.List;


import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;


public interface CourseOfferingService {
	public List<Course> getallCourseOffering();

	public List<CourseOffering> getCourseOffering(long courseid);

	public CourseOffering getOneCourseOffering(long courseofferingId);
	
	
}	
