package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.StringCalculator;

class StringCalculatorTest {

	@Test
	void whenEmptyStringIsPassedThenReturn0AsSum() {
		StringCalculator cal= new StringCalculator();
		assertEquals(0,cal.add(""));
		
	}

}
