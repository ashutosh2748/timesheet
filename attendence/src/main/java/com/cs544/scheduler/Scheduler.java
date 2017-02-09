package com.cs544.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Scheduler {

	@Scheduled(cron="0 0 10,17 * * ?")
	//@Scheduled(cron="0/10 * * * * ?") // --test
	public void importingAttendanceRecords()
	{
		System.out.println("importing attendance records...");
		
	}
}
