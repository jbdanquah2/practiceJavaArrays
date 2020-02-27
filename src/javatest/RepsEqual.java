package javatest;

import java.util.Arrays;

public class RepsEqual {
	
	public static void main(String[] args) {
		int n = 53;
		int[] a = {0,5,3};
		repsEqual(a, n);
		
	}
	
	static int repsEqual(int[] a, int n) {
		int result = 0;
		int len = a.length;
		int[] b = new int[len];
		if (len == 0) return result;

		for (int i = len - 1; i >= 0; i--) {
			int mem;
			mem = n % 10;
			b[i] = mem;
			n = n / 10;
		}
		
		//System.out.println(Arrays.toString(b));
		//System.out.print(Arrays.toString(a));
		
		if (Arrays.equals(a,b)) {
			result = 1;
			System.out.println(result);
		}
		System.out.println(result);
		return result;
	}

}
