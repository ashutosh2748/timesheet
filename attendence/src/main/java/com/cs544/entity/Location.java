package com.cs544.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Location {
	
	@Id
	@GeneratedValue
	private long id;
	private String locationId;
	private String name;
	@OneToMany(mappedBy="location")
	private List<AttendanceRecord> attendanceRecord;
	@OneToMany(mappedBy="location")
	private List<CourseOffering> courseOfferingList;
	public List<AttendanceRecord> getAttendanceRecord() {
		return attendanceRecord;
	}
	public void setAttendanceRecord(List<AttendanceRecord> attendanceRecord) {
		this.attendanceRecord = attendanceRecord;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<CourseOffering> getCourseOfferingList() {
		return courseOfferingList;
	}
	public void setCourseOfferingList(List<CourseOffering> courseOfferingList) {
		this.courseOfferingList = courseOfferingList;
	}
}
