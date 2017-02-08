package com.cs544.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs544.dao.CourseOfferingDAO;
import com.cs544.entity.CourseOffering;

@Controller
@RequestMapping("/admin")
public class DataController {
	@Autowired
	CourseOfferingDAO courseofferingdao;

	@RequestMapping(value = "/data")
	public String dashboard(Model model) {
		model.addAttribute("page_title", "Admin Dashboard");
		Iterable<CourseOffering> courselist=courseofferingdao.findAll();
		int i=0;
		for(CourseOffering c:courselist){
			LocalDate date1=LocalDate.of(2012, 12, 23);
			LocalDate date2=LocalDate.of(2014, 12, 23);
			i++;
			c.setEndDate(date1.plusDays(i));
			
			c.setStartDate(date2.plusDays(i));
			
		}
		
		courseofferingdao.save(courselist);

		
		
		
		return "admin/home";
	}

}
