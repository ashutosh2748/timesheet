package com.cs544.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cs544.entity.CourseOffering;
import com.cs544.entity.Student;

public interface CourseOfferingDAO extends CrudRepository<CourseOffering, Long>{

	//List<CourseOffering> findByCourseId(long courseid);

}
//