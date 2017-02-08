package com.cs544.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue
	private long id;
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public CourseOffering getCourseOffering() {
		return courseOffering;
	}
	public void setCourseOffering(CourseOffering courseOffering) {
		this.courseOffering = courseOffering;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	@ManyToOne
	private Student student;
	@ManyToOne
	private CourseOffering courseOffering;
	private double GPA;

}
