package fizzbuzz;

public class FizzBuzz {

	public static final String UN = "1";
	public static final String DEUX = "2";
	public static final String FIZZ = "fizz";
	
	public String fizzbBuzz(int input) {
		if(input == 3) return FIZZ;
		return Integer.toString(input);
	}

}
