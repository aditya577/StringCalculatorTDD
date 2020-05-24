package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.StringCalculator;

class StringCalculatorTest {

	final StringCalculator cal= new StringCalculator();
	
	@Test
	void whenEmptyStringIsPassedThenReturn0AsSum() {
		assertEquals(0,cal.add(""));
	}
	
	@Test
	void whenOneNumberIsPassedThenReturnSameAsSum() {
		assertEquals(1,cal.add("1"));
	}

}
