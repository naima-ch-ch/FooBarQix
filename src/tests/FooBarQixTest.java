package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.FooBarQix;

class FooBarQixTest {

	@Test
	void test() {		 
		FooBarQix fooBarQix = new FooBarQix(); 
		assertEquals("*", fooBarQix.fooBarQixResult(0));
		assertEquals("1", fooBarQix.fooBarQixResult(1));
		assertEquals("Foo", fooBarQix.fooBarQixResult(13));
		assertEquals("FooBarQix*Bar", fooBarQix.fooBarQixResult(105));
		assertEquals("FooQix**", fooBarQix.fooBarQixResult(10101));
		assertEquals("FooFooFoo", fooBarQix.fooBarQixResult(33));
		assertEquals("*Qix", fooBarQix.fooBarQixResult(107));
	}

}
