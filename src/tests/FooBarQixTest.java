package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.FooBarQix;

class FooBarQixTest {

	@Test
	void test() {
		int number0 = 0;
		int number = 105;
		int number2 = 10101;
		int number3 = 33;
		FooBarQix fooBarQix = new FooBarQix();
		String result0 = fooBarQix.fooBarQixResult(number0);
		String result1 = fooBarQix.fooBarQixResult(number);
		String result2 =  fooBarQix.fooBarQixResult(number2);
		String result3 =  fooBarQix.fooBarQixResult(number3);
		assertEquals("*", result0);
		assertEquals("FooBarQix*Bar", result1);
		assertEquals("FooQix**", result2);
		assertEquals("FooFooFoo", result3);
	}

}
