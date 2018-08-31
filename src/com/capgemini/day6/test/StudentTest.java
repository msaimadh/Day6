package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


import com.capgemini.day6.Student;

class StudentTest {

	@Test
	void test() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("madhuri",15678,"ece"));
		students.add(new Student("maithreyi",13456,"cse"));
		students.add(new Student("madhavi",12345,"eee"));
		students.add(new Student("meena",78954,"mech"));
	}

}
