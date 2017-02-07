package com.cs544.service;

import org.springframework.stereotype.Service;

import com.cs544.entity.Student;

public interface StudentService {
	
	public Student get(long id);
	public Student findByName(String name);
	public Student findByBarCode(String barCode);

}	
