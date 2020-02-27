package javatest;

public class Fibonacci {
	public static void main(String[] args) {
		
		
		System.out.println(isFibonacci(13));
	}
	
	static int isFibonacci(int num) {
		int result = 0;
		int n1 = 1, n2 = 2, n3 = 0;
		for (int i = 0; i <= num/2; i++) {
			n3 = n1 + n2;
			//System.out.println(n3);
			n1 = n2;
			n2 = n3;
			if (n3 == num ) {
				result = 1;
				System.out.println(n3);
				return result;
			}
			
		}
		return result;
	}
}
