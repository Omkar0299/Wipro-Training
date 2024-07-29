package com.wipro.junit5.calculator;

import static org.junit.jupiter.api.Assertions.*;
import com.example.shapes.*;

import org.junit.jupiter.api.Test;

class TestCircle {

	@Test
	void test() {
		Circle obj = new Circle();
		double actualValue = obj.area(4);
		assertEquals(50.26548,actualValue );
			}

}
