package com.exchangerate.restclient;

import java.util.NoSuchElementException;

import org.springframework.web.client.RestTemplate;

import com.exchangerate.dto.USD;

public class ExchangeRestClient {

	public USD getExchangerRate(){
		RestTemplate resttamplate = new RestTemplate();
		USD usd = resttamplate.getForObject("https://www.floatrates.com/daily/EUR.json", USD.class);
		return usd;
	}
}
