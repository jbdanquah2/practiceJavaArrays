package javatest;

public class IsFactorialPRime {

	public static void main(String[] args) {
		
		isFactorialPrime(727);
		
	}
	
	static int isFactorialPrime(int n) {
		int result = 0;
		int fac = 1;
		if (n <= 1) {
			result = 0;
			return result;
		}
		
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0) {
				result = 0;
				System.out.println("Not prime: " + result);
				return result;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			fac *= i;
			if (n == (fac + 1)) {
				result = 1;
				System.out.println(i);
				break;
			}
		}
		
		
		System.out.println(result + " fac: " +  (fac+1));
		
		return result;
	}

}
