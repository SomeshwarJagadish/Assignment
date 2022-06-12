package com.exchangerate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exchangerate.dto.ExchangeToUSD;
import com.exchangerate.dto.USD;
import com.exchangerate.restclient.ExchangeRestClient;

@Controller
public class ExhangeController {

	@RequestMapping("/exchange/rate/euro/usd")
	public String getExchangeRate(ModelMap map) {
		ExchangeRestClient erc = new ExchangeRestClient();
		USD usd = erc.getExchangerRate();
		ExchangeToUSD etu = usd.getUsd();
		map.addAttribute("etu", etu);
		return "exchange_to_euro";
	}
	
}
