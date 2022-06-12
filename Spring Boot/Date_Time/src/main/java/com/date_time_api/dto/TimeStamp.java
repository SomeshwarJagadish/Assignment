package com.date_time_api.dto;

import java.sql.Timestamp;

public class TimeStamp {
	private Timestamp timestamp=new Timestamp(System.currentTimeMillis());

	public Timestamp getTimestamp() {
		return timestamp;
	}
	
}
