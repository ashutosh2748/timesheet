package com.cs544.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	
	
	@Id
	@GeneratedValue
	private long id;
	@OneToMany(mappedBy="course")
	private List<CourseOffering> courseOfferingList;
	
	private String courseId;
	private String description;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<CourseOffering> getCourseOfferingList() {
		return courseOfferingList;
	}
	public void setCourseOfferingList(List<CourseOffering> courseOfferingList) {
		this.courseOfferingList = courseOfferingList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
