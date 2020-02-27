package javatest;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] arry = {25, 14, 56, 15};
		
		CopyArray ca = new CopyArray();
		ca.copyArray(arry);
		
	}
	
	public int copyArray(int[] arry) {
		int len = arry.length;
		int[] newArry = new int[len];
		for (int i = 0, j = 0; i < len; i++, j++) {
			newArry[j] = arry[i];
		}
		
		// System.out.println(Arrays.toString(arry));
		System.out.println(Arrays.toString(newArry));
		return 1;
	}
}
