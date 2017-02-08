package com.cs544.business;


import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;

public class Report {
	Student student;
	long Average;
	CourseOffering coffering;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public long getAverage() {
		return Average;
	}
	public void setAverage(long average) {
		Average = average;
	}
	public CourseOffering getCoffering() {
		return coffering;
	}
	public void setCoffering(CourseOffering coffering) {
		this.coffering = coffering;
	}
	
	
	
}
