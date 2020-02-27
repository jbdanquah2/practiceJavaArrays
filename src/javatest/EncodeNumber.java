package javatest;

public class EncodeNumber {

	public static void main(String[] args) {
		System.out.println(encodeNumber(6));
		//System.out.println(isPrime(17));
	}
	
	public static int[] encodeNumber(int n) {
		int[] result = null;
		if (n <= 1) return result;
		
		
		
		return result;
	}
	
	public static boolean isPrime(int num) {
		boolean result = true;
		if (num <= 1) return result;
		
		for (int i = 2; i <= num; i++) {
			for (int j = 2; j < num; j++) {
				if (i * j == num) {
					result = false;
					return result;
				}
			}
		}
		
		return result;
	}
}
