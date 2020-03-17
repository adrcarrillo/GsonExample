package com.arn.gsonexample;

public class Item {
	private String date;
	private String shop;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	
	@Override
	public String toString() {
		//Custom output
		return "Item [date=" + date + ", shop=" + shop + "]";
	}
}
