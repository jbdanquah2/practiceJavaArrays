package javatest;

import java.util.Arrays;

public class DuplicateArrayVal {

	public static void main(String[] args) {
		int[] arry = {2,3,2,5,7,9,5};
		String[] arry1 = {"John","Kofi","Alex","Kofi","Win"};
		findDuplicateVal(arry);
		findDuplicateVal(arry1);
		
	}
	
	public static int findDuplicateVal(int[] arry) {
		int len = arry.length; 
		int dup = 0;
		int[] dupArry = new int[len];
		
		for (int i = 0; i < len; i++ ) {
			for (int j = 0 ; j < len; j++) {
				if (arry[i] == arry[j] && i != j) {
					dup = arry[j];
					dupArry[j] = dup;
					System.out.println(dup);
				}
			}
		}
		return 1;
	}
	
	public static String findDuplicateVal(String[] arry) {
		int len = arry.length; 
		
		for (int i = 0; i < len; i++ ) {
			for (int j = 0 ; j < len; j++) {
				if (arry[i].equals(arry[j]) && i != j) {
					
					System.out.println(arry[i]);
				}
			}
		}
		return "ok";
	}
}
