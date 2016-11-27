package utils;

public class Math {
	public static int factorial(int n) {
		if (n <= 0) 
			return 1;
		else
			return n * factorial(n - 1);	
	}
	
	public static int factorialLoop(int n) {
		int output = 1;
		for (int i=1; i <= n; i++) {
			output *= i;
		}
		return output;
	}
}
