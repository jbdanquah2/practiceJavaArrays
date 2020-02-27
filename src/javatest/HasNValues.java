package javatest;

import java.util.Arrays;

public class HasNValues {

	public static void main(String[] args) {
		int arry[] = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		System.out.print(hasNValues(arry, 10));	
	}
	
	static int hasNValues(int[] arry, int n) {
		int result = 0;
		int len = arry.length;
		int newArry[] = new int[len];
		
		int count = 1;
		
		for (int i = 0; i < len; i++) {
			newArry[i] = arry[i];
		}
		Arrays.sort(newArry);
		for (int j = 0; j < len - 1; j++) {
			if (newArry[j] != newArry[j+1]) {
				count++;
			}
			
		}
		
		if (count == n) {
			result = 1;
		}
		
		
		return result;
	}

}
