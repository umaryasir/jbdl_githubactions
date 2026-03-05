package com.geek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	@Test
	void testAdd() {
		CalculatorService cal = new CalculatorService();
		assertEquals(20,cal.add(15, 5));
	}
	
	@Test
	void testDiff() {
		CalculatorService cal = new CalculatorService();
		assertEquals(10,cal.diff(15, 5));
	}

}
