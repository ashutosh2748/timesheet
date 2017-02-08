package com.cs544.service;

import org.springframework.stereotype.Service;

import com.cs544.entity.Student;

public interface StudentService {
	
	public Student get(long id);
	public Student findByStudentId(String StudentId);
	public Student findByBarCode(String barCode);
	Student findByName(String name);

}	
