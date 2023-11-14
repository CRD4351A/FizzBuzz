package fizzBuzztest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fizzBuzz.FizzBuzz;

class FizzBuzzTest {

	@Test
	void fizz_un() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	@Test
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2),"2");
	}

}
