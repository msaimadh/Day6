package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.Cellphone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.Television;

class Question2Test {
@Test
void testLaptopProducts() {
		HashSet<Laptop> laptops = new HashSet<>();
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		assertEquals(true, laptops.add(new Laptop("mac", "macbookAir", "IOS", "i5")));
		assertEquals(true, laptops.add(new Laptop("compaq", "latitude3480", "Windows 8", "i5")));
		assertEquals(false, laptops.add(new Laptop("compaq", "latitude3480", "Windows 10", "i5")));
		assertEquals(3, laptops.size());
	}
			
@Test
void testCarDetails() {
	HashSet<Car> cars = new HashSet<>();
	assertEquals(true,cars.add(new Car("HONDA","RC390",2014,390000.00)));
	assertEquals(true,cars.add(new Car("MARUTHI","Ritz",2008,600000.00)));
	assertEquals(true,cars.add(new Car("HYUNDAI", "I10",2009,500000.00)));
	assertEquals(false,cars.add(new Car("HONDA","zen",2018,390000.00)));
	
	
	assertEquals(3, cars.size());
}
@Test
void testTelevisionDetails() {
	HashSet<Television> televisions = new HashSet<>();
	
	assertEquals(true, televisions.add(new Television("SAMSUNG", "PLASMA","yes",50000.00)));
	assertEquals(true, televisions.add(new Television("LG", "LED", "NO",600000)));
	assertEquals(true, televisions.add(new Television("SONY", "LCD", "YES",40000)));
	assertEquals(false, televisions.add(new Television("SAMSUNG", "PLASMA","no",50000.00)));
	
	assertEquals(3, televisions.size());
}
@Test
void testCellphoneDetails() {
	HashSet<Cellphone> cellphones = new HashSet<>();
	
	assertEquals(true, cellphones.add(new Cellphone("SAMSUNG", "XPLAY","smart","operating",50000.00)));
	assertEquals(true, cellphones.add(new Cellphone("MOTO", "GPLUS","Fast","oxygen",8000)));
	assertEquals(true, cellphones.add(new Cellphone("LEnovo", "VIBE", "Multitask","Zenui",7000)));
	assertEquals(false, cellphones.add(new Cellphone("SAMSUNG", "ZPLAY","smart","operating",50000.00)));
	assertEquals(3, cellphones.size());
}
}
