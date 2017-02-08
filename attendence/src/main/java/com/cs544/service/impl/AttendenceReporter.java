package com.cs544.service.impl;

import java.time.temporal.ChronoUnit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.business.Report;
import com.cs544.dao.CourseOfferingDAO;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;
@Service
public class AttendenceReporter {

	
	@Autowired
	private CourseOfferingDAO courseofferingdao;
	
	
	
	@Autowired
	private AttendanceRecordServiceImpl attendancerecordservice;
	
	public List<Report> generateReport(long courseofferingid){
		CourseOffering courseoffering=courseofferingdao.findOne(courseofferingid);
		List<Student> students=attendancerecordservice.getStudentsBycourseofferingId(courseofferingid);
		List<Report> reports=new ArrayList();
		long ValidDays=getValidDays(courseoffering);
		for(Student s:students){
			int count=s.getAttendanceRecord().size();
			double avgPercentage=count/ValidDays;
			Report report=new Report();
			report.setAverage(avgPercentage);
			report.setStudent(s);
			reports.add(report);
		}
		return reports;
		
	}

	private long getValidDays(CourseOffering courseoffering) {
		// TODO Auto-generated method stub
	//	 days=courseoffering.getEndDate().minus(courseoffering.getStartDate());
		
		long days=0;
		try{
			days=ChronoUnit.DAYS.between(courseoffering.getEndDate(), courseoffering.getStartDate());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return days;
	}
	
	

}
