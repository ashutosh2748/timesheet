package com.cs544.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cs544.entity.AttendanceRecord;
import com.cs544.entity.Session;
import com.cs544.entity.Timeslot;

public interface TimeslotDAO extends CrudRepository<Timeslot, Long>{

	//@Query("SELECT p FROM AttendanceRecord p join p.student s WHERE p.barcode = :barcode ")
	//public List<AttendanceRecord> findbyBarcode(@Param("barcode") String barcode);
	
	//public List<AttendanceRecord> findByStudent();
		
}
//