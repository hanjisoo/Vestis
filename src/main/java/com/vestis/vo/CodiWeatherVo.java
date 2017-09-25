package com.vestis.vo;

import org.springframework.stereotype.Repository;

@Repository
public class CodiWeatherVo {
	private int no;
	private int weatherNo;
	private int temp;
	
	public CodiWeatherVo() {}

	public CodiWeatherVo(int weatherNo, int temp) {
		this.weatherNo = weatherNo;
		this.temp = temp;
	}

	public CodiWeatherVo(int no, int weatherNo, int temp) {
		this.no = no;
		this.weatherNo = weatherNo;
		this.temp = temp;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getWeatherNo() {
		return weatherNo;
	}

	public void setWeatherNo(int weatherNo) {
		this.weatherNo = weatherNo;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "CodiWeatherVo [no=" + no + ", weatherNo=" + weatherNo + ", temp=" + temp + "]";
	}
}
