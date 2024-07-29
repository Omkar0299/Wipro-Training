package com.wipro.junit5.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import com.wipro.junit5.test.Calculator;

import org.junit.jupiter.api.Test;

class TestCalculator {
	
	private static Calculator cal=null;
	
	@BeforeAll
	public static void setUp() {
		cal=new Calculator();
	}

	@Test
	public void testSum() {
		
		int actualValue = cal.sum(5, 10);
		assertEquals(15,actualValue);
	}
	@Test
	public void testSub() {
		
		int actualValue = cal.sub(5, 10);
		assertEquals(-5,actualValue);
	}
		@Test
		public void testMul() {
			
			int actualValue = cal.mul(5, 10);
			assertEquals(50,actualValue);
		}
			@Test
			public void testDiv() {
				
				int actualValue = cal.div(50, 10);
				assertEquals(5,actualValue);
			}

}
