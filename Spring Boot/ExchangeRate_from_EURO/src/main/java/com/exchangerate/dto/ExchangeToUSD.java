package com.exchangerate.dto;

public class ExchangeToUSD {
	private String code;
	private String alphacode;
	private int numericCode;
	private String name;
	private double rate;
	private String date;
	private double inverseRate;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAlphacode() {
		return alphacode;
	}
	public void setAlphacode(String alphacode) {
		this.alphacode = alphacode;
	}
	public int getNumericCode() {
		return numericCode;
	}
	public void setNumericCode(int numericCode) {
		this.numericCode = numericCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getInverseRate() {
		return inverseRate;
	}
	public void setInverseRate(double inverseRate) {
		this.inverseRate = inverseRate;
	}
	
}
