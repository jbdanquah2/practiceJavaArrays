package javatest;

public class ArrayPattern {

	public static void main(String[] args) {
		int[] a = {3,2,1};
		int[] p = {2,1};
		
		//matches(a,p);
		isStacked(6);
		
		
	}
	
	static int matches(int[] A, int[] P) {
		int result = 0;
		
		
		for (int i = 0; i < P[0]; i ++) {
			for (int j = 0; j < i; j++ ) {
				
			}
		}
		
		return result;
	}
	
	static int isStacked(int num) {
		int result = 0;
		int sum = 0;
		if (num < 1) {
			result = 0;
			System.out.println("Number less than 1.  Result: " + result);
		}
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			
			if (sum == num) {
				result = 1;
				break;
			}
		}
		
		System.out.println("This: " +  result + " ...And this is Sum: " + sum);
		return result;
	}
}
