package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;
import com.capgemini.day6.Car2;

class Car2Test {

	@Test
		void testCar2Details() {
			TreeSet<Car2> cars = new TreeSet<>();
			
			cars.add(new Car2("HONDA","RC390",2014,390000.00));
			cars.add(new Car2("MARUTHI","Ritz",2008,600000.00));
			cars.add(new Car2("HYUNDAI", "I10",2009,500000.00));
			
			assertEquals(3, cars.size());
	}

}
