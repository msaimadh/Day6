package com.capgemini.day6;

import java.util.Objects;

public class Cellphone {
	private String company;
	private String model;
	private String description;
	private String operatingsystem;
	private double price;
	public Cellphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cellphone(String company, String model, String description, String operatingsystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingsystem = operatingsystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperatingsystem() {
		return operatingsystem;
	}
	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingsystem=" + operatingsystem + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Cellphone c2 = (Cellphone) obj;
		return this.company == c2.company && this.description == c2.description 
					&& this.operatingsystem == c2.operatingsystem;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(company,description,operatingsystem);
	}
}
