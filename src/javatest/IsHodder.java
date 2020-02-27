package javatest;

public class IsHodder {

	public static void main(String[] args) {

		isHodder(127);
	}
	
	static int isHodder(int num) {
		int result = 0;
		int sqr = 0;
		
		if (num <= 1) {
			result = 0;
			System.out.println(result);
			return result;
		}
		
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				result = 0;
				System.out.println("Don't Prime number: " + result);
				return result;
			}
		}
		
		for (int i = 1; i < num; i++) {
				for ( int j = 1; j <= i; j++) {
					sqr = sqr + 2 * 2;
					if (num == sqr - 1) {
						result = 1;
						System.out.println("Found y'a!" + " j: " + (i));			
					}
				}
		}
		
		System.out.println("last: " +result);
		return result;
	}

}
