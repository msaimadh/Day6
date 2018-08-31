package com.capgemini.day6;

import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private String enabled;
	private double price;
	public Television(String company, String type, String enable, double price) {
		super();
		this.company = company;
		this.type = type;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", enabled=" + enabled + ", price=" + price + "]";
	}
}
	