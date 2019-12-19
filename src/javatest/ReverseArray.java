package javatest;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arry = {1,2,3,4,5};
		ReverseArray revA = new ReverseArray();
		revA.reverseArray(arry);
	}
	
	public int[] reverseArray(int[] arry) {
		
		int len = arry.length;
		int[] reverse = new int[len];
		
		for (int i = len-1, j = 0; i >=0; i--, j++) {
			
			reverse[j] = arry[i];
		}
		System.out.println("hey: "+Arrays.toString(reverse));
		return arry;
	}
}
