package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import com.capgemini.day6.Car;
import com.capgemini.day6.Cellphone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.Television;

class Question1Test {

	@Test
	void test() {

		
		class LaptopTest {

			@Test
			void testLaptopProducts() {
					ArrayList<Laptop> laptops = new ArrayList<>();
					
					assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
					laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
					laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
					
					assertEquals(3, laptops.size());
				}

		}

	}
	@Test
	void testCarDetails() {
		ArrayList<Car> cars = new ArrayList<>();
		assertEquals(true,cars.add(new Car("HONDA","RC390",2014,390000.00)));
		
		cars.add(new Car("MARUTHI","Ritz",2008,600000.00));
		cars.add(new Car("HYUNDAI", "I10",2009,500000.00));
		
		assertEquals(3, cars.size());
	}

	@Test
	void testTelevisionDetails() {
		ArrayList<Television> televisions = new ArrayList<>();
		
		assertEquals(true, televisions.add(new Television("SAMSUNG", "PLASMA","yes",50000.00)));
		televisions.add(new Television("LG", "LED", "NO",600000));
		televisions.add(new Television("SONY", "LCD", "YES",40000));
		
		assertEquals(3, televisions.size());
		
	}

	@Test
	void testCellphoneDetails() {
		ArrayList<Cellphone> cellphones = new ArrayList<>();
		
		assertEquals(true, cellphones.add(new Cellphone("SAMSUNG", "XPLAY","smart","operating",50000.00)));
		cellphones.add(new Cellphone("MOTO", "GPLUS","Fast","oxygen",8000));
		cellphones.add(new Cellphone("LEnovo", "VIBE", "Multitask","Zenui",7000));
		
		assertEquals(3, cellphones.size());
		
	}

}
