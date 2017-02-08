package com.cs544.dao;

import org.springframework.data.repository.CrudRepository;

import com.cs544.entity.Student;

public interface StudentDAO extends CrudRepository<Student, Long>{
    public Student findByStudentId(String studentId);

}

//test