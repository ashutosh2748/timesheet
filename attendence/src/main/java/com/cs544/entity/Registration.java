package com.cs544.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Registration {
	
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	@JoinColumn(name="student_id2")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="courseOffering_id2")
	private CourseOffering courseOffering1;
	private double GPA;
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
	
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	public CourseOffering getCourseOffering1() {
		return courseOffering1;
	}
	public void setCourseOffering1(CourseOffering courseOffering1) {
		this.courseOffering1 = courseOffering1;
	}
}
