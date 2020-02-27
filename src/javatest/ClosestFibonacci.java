package javatest;

public class ClosestFibonacci {

	public static void main(String[] args) {
		System.out.println(closestFibonacci(9));
		
	}

	static int closestFibonacci(int num) {
		int closestFibo = 0;
		int n1 = 1, n2 = 1, n3 = 0;
		
		if (num < 1 ) {
			return closestFibo;
		}
		
		for (int i = 2; i <= num; i++) {
			n3 = n1 + n2;
			if (n3 <= num && n3 > n2) {
				closestFibo = n3;
			}
			n1 = n2;
			n2 = n3;
		
		}
		return closestFibo;
	}
}
