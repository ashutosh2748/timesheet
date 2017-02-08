package com.cs544.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CourseOffering {
	@Id
	@GeneratedValue
	private long id;
	private String courseOfferingId;
	@ManyToOne
	private Course course;
	private LocalTime startDate;
	private LocalTime endDate;
	@ManyToOne
	private Location location;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseOfferingId() {
		return courseOfferingId;
	}
	public void setCourseOfferingId(String courseOfferingId) {
		this.courseOfferingId = courseOfferingId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public LocalTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalTime startDate) {
		this.startDate = startDate;
	}
	public LocalTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalTime endDate) {
		this.endDate = endDate;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
}
