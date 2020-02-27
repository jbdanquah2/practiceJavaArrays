package javatest;

public class IsPrime {

	public static void main(String[] args) {
		
		System.out.println(isPrime(8));
	}
	
	public static boolean isPrime(int n) {
		boolean result = true;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= n; j++) {
				if (i * j == n) { 
					result = false;
					break;
				}
			}
		}
		
		return result;
	}

}
