package com.date_time_api.restcontroller;



import java.sql.Timestamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.date_time_api.dto.TimeStamp;

@RestController
@RequestMapping("/GET")
public class DateAndTimeRestController {

	@GetMapping("/timestamp")
	public TimeStamp getDateAndTime() {
		TimeStamp timestamp = new TimeStamp();
		return timestamp;
	}
}
