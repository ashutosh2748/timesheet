package com.cs544.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs544.dao.StudentDAO;
import com.cs544.entity.Student;
import com.cs544.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	
	
	@Override
	public Student get(long id) {
		Student student = studentDAO.findOne(id);
		return student;
	}

	@Override
	public Student findByName(String name) {
		// TODO Auto-generated method stub
	//	Student student=studentDAO.findAll();
		return null;
	}

	@Override
	public Student findByBarCode(String barCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByStudentId(String studentId) {
		// TODO Auto-generated method stub
		Student student = studentDAO.findByStudentId(studentId);
		return student;
	}

}
