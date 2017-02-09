package com.cs544.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Session {
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	private Timeslot timeslot;
	@ManyToOne
	@JoinColumn(name="courseOffering_id5")
	private CourseOffering courseOffering4;
	private LocalTime date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Timeslot getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(Timeslot timeslot) {
		this.timeslot = timeslot;
	}
	public LocalTime getDate() {
		return date;
	}
	public void setDate(LocalTime date) {
		this.date = date;
	}
	public CourseOffering getCourseOffering4() {
		return courseOffering4;
	}
	public void setCourseOffering4(CourseOffering courseOffering4) {
		this.courseOffering4 = courseOffering4;
	}
}
