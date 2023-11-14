package fizzBuzz;

public class FizzBuzz {

	public static String fizzbuzz(int i) {
		if(i%3==0)
		{
			return"Fizz";
		}
		if(i%5==0)
		{
			return"Buzz";
		}
		return String.valueOf(i);
	}

}
