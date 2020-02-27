package javatest;

public class IsPrimeHappy {

	public static void main(String[] args) {
		
		System.out.println(isPrimeHappy(25));
	}
	
	public static int isPrimeHappy(int n) {
		int result = 0;
		int sum = 0;
		if (n <= 2) return result;
		
			for (int i = 2; i < n; i++) {
				if (isPrime(i)) {
					sum += i;
				}
			}
			
			if (sum % n == 0 ) {
				System.out.println("sum: " + sum);
				result = 1;
				return result;
			}
		System.out.println(sum);
		return result;
	}
	
	public static boolean isPrime(int num) {
		boolean result = true;
		
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j <= num; j++ ) {
				if (i * j == num ) {
					result = false;
					break;
				}
			}
		}
		
		return result;
	}
}
