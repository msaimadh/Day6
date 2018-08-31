package com.capgemini.day6;

public class Student {

	private String name;
	private int Rollno;
	private String branch;

	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Rollno=" + Rollno + ", branch=" + branch + "]";
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student(String name, int rollno, String branch) {
		super();
		this.name = name;
		Rollno = rollno;
		this.branch = branch;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}