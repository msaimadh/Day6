package com.capgemini.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.NaturalOrder;


class NaturalOrderTest {

	@Test
	void test() {
		TreeSet<NaturalOrder> no = new TreeSet<>();
		no.add(new NaturalOrder("madhuri",1));
		no.add(new NaturalOrder("maithreyi",3));
		no.add(new NaturalOrder("madhavi",2));
		no.add(new NaturalOrder("meena",4));
	}

}
