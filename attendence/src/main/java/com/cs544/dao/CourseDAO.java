package com.cs544.dao;

import org.springframework.data.repository.CrudRepository;

import com.cs544.entity.Course;
import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;

public interface CourseDAO extends CrudRepository<Course, Long>{

}
//