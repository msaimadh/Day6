package com.capgemini.day6;

public class NaturalOrder implements Comparable<NaturalOrder>{
private String name;
private int rollno;
public NaturalOrder() {
	super();
	// TODO Auto-generated constructor stub
}
public NaturalOrder(String name, int rollno) {
	super();
	this.name = name;
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
@Override
public String toString() {
	return "NaturalOrder [name=" + name + ", rollno=" + rollno + "]";
}
@Override
public int compareTo(NaturalOrder no) {
	// TODO Auto-generated method stub
	return Integer.compare(this.rollno,no.rollno);
}
}

