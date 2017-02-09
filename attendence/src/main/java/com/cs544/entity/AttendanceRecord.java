package com.cs544.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AttendanceRecord {
	
	@Id
	@GeneratedValue
	private int id;
	
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name="location_id2")
	private Location location;
	@ManyToOne
	private Timeslot timeslot;
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public Student getStudent() {
//		return student;
//	}
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	public Timeslot getTimeslot() {
		return timeslot;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public void setTimeslot(Timeslot timeslot) {
		this.timeslot = timeslot;
	}

	
}
