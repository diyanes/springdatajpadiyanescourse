package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.junit.JUnitRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

class DateTest {


	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void date_plus_6() {
		int scheduleDay = 7;
		//LocalDate today = LocalDate.now();
		 LocalDate today = LocalDate.of(2020, 12, 22);
		LocalDate nextScheduleDate = null;
		if (today.getDayOfMonth() <= scheduleDay) {
			logger.info("Schdule day fall in the same month");
			nextScheduleDate = today.with(TemporalAdjusters.firstDayOfMonth()).plusDays(scheduleDay-1);
		}else {
			logger.info("Schdule day fall in the next month");
			nextScheduleDate = today.with(TemporalAdjusters.firstDayOfNextMonth()).plusDays(scheduleDay-1);
		}
		logger.info("Today -> {} ",today);
		logger.info("Schdule day -> {} ",nextScheduleDate);
		
		//fruits.forEach(f -> f.setName(f.getName() + "s"))
	}
	
	@Ignore
	public void add_days() {
		int scheduleDay = 7;
		LocalDate localDate = LocalDate.of(2020, 12, 30);
		LocalDate today = LocalDate.now();
	      //adding 5 days to the given localdate
	    LocalDate newDate = localDate.plusDays(5);
	    LocalDate date = LocalDate.parse("2014-12-03");
	    
		logger.info("Schdule day fall in next month {} ", today.with(TemporalAdjusters.firstDayOfNextMonth()));
			
		logger.info("Today -> {}",localDate);
	}
}
