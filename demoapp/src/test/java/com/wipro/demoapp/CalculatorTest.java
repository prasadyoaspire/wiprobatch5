package com.wipro.demoapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void testIsPrime() {		
		Calculator cal = new Calculator();
		boolean result = cal.isPrime(25);
		
		assertFalse(result);
	}
	
	@Test
	void testIsPrimeTrue() {		
		Calculator cal = new Calculator();
		boolean result = cal.isPrime(19);
		
		assertTrue(result);
	}
}
