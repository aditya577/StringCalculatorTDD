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
	
	@Test
	void whenTwoNumbersArePassedSeparatedByCommaThenReturnTheirSum() {
		assertEquals(1+2,cal.add("1,2"));
	}

	@Test
	void whenManyNumbersArePassedSeparatedByCommaThenReturnTheirSum() {
		assertEquals(1+2+3+4+5+6+7,cal.add("1,2,3,4,5,6,7"));
	}
	
	@Test
	void whenNumbersArePassedSeparatedByCommaOrNewLineThenReturnTheirSum() {
		assertEquals(1+2+3+4,cal.add("1,2\n3,4"));
	}
	
}
