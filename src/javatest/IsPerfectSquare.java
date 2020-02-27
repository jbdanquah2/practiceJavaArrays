package javatest;

public class IsPerfectSquare {

	public static void main(String[] args) {

		System.out.println(isPerfectSquare(5));
	}
	
	public static int isPerfectSquare(int n) {
		int result = 0;
		n = Math.abs(n);
		for (int i = 1; i <= n/2; i++) {
			if (i * i == n) {
				result = 1;
				break;
			}
		}
		
		return result;
	}

}
