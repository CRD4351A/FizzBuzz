package fizzBuzztest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fizzBuzz.FizzBuzz;

class FizzBuzzTest {

	@Test
	void test() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}

}
