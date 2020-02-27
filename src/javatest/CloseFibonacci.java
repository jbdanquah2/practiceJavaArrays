package javatest;

public class CloseFibonacci {

	public static void main(String[] args) {
		closestFibonacci(34);
		
	}
	
	static int closestFibonacci(int num) {
		int result = 0;
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;
		System.out.print(n1 + " "+ n2);
		for (int i = 3; i <= num/2; i++) {
			n3 = n1 + n2;
			if (n3 > n2 && n3 <= num) {
				result = n3;
			}
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
			
		}
		System.out.print(result);
		return result;
	}
}
