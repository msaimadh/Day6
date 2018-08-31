package com.capgemini.day6;

public class Car2 implements Comparable<Car2>{
	private String make;
	private String model;
	private int year;
	private double price;
	public Car2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car2(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car2 [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	public int compareTo(Car2 cars) {
		// TODO Auto-generated method stub
		return this.make.compareTo(cars.make);
	}
	}
