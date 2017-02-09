package com.cs544.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Timeslot {
	@Id
	@GeneratedValue
	private long id;
	private String abbrv;
	private String description;
	private LocalTime beginTime;
	private LocalTime endTime;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAbbrv() {
		return abbrv;
	}
	public void setAbbrv(String abbrv) {
		this.abbrv = abbrv;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalTime getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(LocalTime beginTime) {
		this.beginTime = beginTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
}
