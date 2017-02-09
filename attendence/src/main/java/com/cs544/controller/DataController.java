package com.cs544.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs544.dao.AttendanceRecordDAO;
import com.cs544.dao.CourseOfferingDAO;
import com.cs544.dao.RegistrationDAO;
import com.cs544.dao.SessionDAO;
import com.cs544.dao.TimeslotDAO;
import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Registration;
import com.cs544.entity.Session;
import com.cs544.entity.Timeslot;

@Controller
@RequestMapping("/admin")
public class DataController {
	@Autowired
	CourseOfferingDAO courseofferingdao;
	@Autowired
	AttendanceRecordDAO attendancedao;
	@Autowired
	SessionDAO sessiondao;
	@Autowired
	TimeslotDAO timeslotdao;

	@RequestMapping(value = "/data")
	public String dashboard(Model model) {
		model.addAttribute("page_title", "Admin Dashboard");
		Iterable<CourseOffering> courselist=courseofferingdao.findAll();
		int i=0;
		LocalDate date1=LocalDate.of(2012, 12, 23);
		LocalDate date2=LocalDate.of(2014, 12, 23);
		for(CourseOffering c:courselist){
			
			i++;
			c.setEndDate(date1.plusDays(i));
			
			c.setStartDate(date2.plusDays(i));
			
		}
		i=90;
		courseofferingdao.save(courselist);
		
		Iterable<AttendanceRecord> attendancelist=attendancedao.findAll();
		
		for(AttendanceRecord a:attendancelist){
			a.setDate(date1.plusDays(i));
			i=i++;
		//	c.setEndDate(date1.plusDays(i));
			
		//	c.setStartDate(date2.plusDays(i));
		}
		attendancedao.save(attendancelist);

		LocalTime time=LocalTime.of(9, 30);
		Iterable<Session> sessionlist=sessiondao.findAll();
		for(Session a:sessionlist){
			a.setDate(time);
		//	c.setEndDate(date1.plusDays(i));
			
		//	c.setStartDate(date2.plusDays(i));
		}
		
		Iterable<Timeslot> slotlist=timeslotdao.findAll();
		
		for(Timeslot a:slotlist){
			a.setBeginTime(time);
			a.setEndTime(time.plusMinutes(20));
		//	c.setEndDate(date1.plusDays(i));
			
		//	c.setStartDate(date2.plusDays(i));
		}
		
		
		return "admin/home";
	}

}
