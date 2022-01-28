
public class Factorial {


	public int factorial(int num){
	
	// base case
	// - condition that will end the repetitions
	if(num == 1 || num == 0){
		return 1;
	}
	
	// 5! = 5 * 4 * 3 * 2 * 1 = 5 * 4!
	return num * factorial(num - 1);
	
	}
}

