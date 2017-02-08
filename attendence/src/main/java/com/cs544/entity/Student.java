package com.cs544.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Id
	@GeneratedValue
	private long id;
	private String studentId;
	private String firstName;
	private String lastName;
	private String barCode;
	@OneToMany
	@JoinColumn(name="student_id2")
	private List<AttendanceRecord> attendanceRecord;
	
	@OneToMany(mappedBy="student")
	private List<Registration> registrationList;
	
	
	public List<Registration> getRegistrationList() {
		return registrationList;
	}
	public void setRegistrationList(List<Registration> registrationList) {
		this.registrationList = registrationList;
	}
	public List<AttendanceRecord> getAttendanceRecord() {
		return attendanceRecord;
	}
	public void setAttendanceRecord(List<AttendanceRecord> attendanceRecord) {
		this.attendanceRecord = attendanceRecord;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
}
