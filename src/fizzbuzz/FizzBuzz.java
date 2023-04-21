package fizzbuzz;

public class FizzBuzz {

	public static final String UN = "1";
	public static final String DEUX = "2";
	public static final String FIZZ = "fizz";
	public static final String BUZZ = "buzz";
	
	/**/
	private int[] nombresSpeciaux = {3,5}; 
	private String[] valeursSpeciales = {"fizz","buzz"};
	
	public String fizzbBuzz(int input) {
		for(int i = 0; i < nombresSpeciaux.length; i++) {
			if(input == nombresSpeciaux[i]) return valeursSpeciales[i];
		}
		return Integer.toString(input);
	}

}
