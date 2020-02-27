package javatest;

import java.util.Arrays;

public class InterchangeMem {

	public static void main(String[] args) {
		int[] arry = {3,2,4,1};
		System.out.println(Arrays.toString(inter(arry)));
		
	}
	
	static int[] inter(int[] arry) {
	
		int len = arry.length;
		for (int i = 0; i < len-1; i++) {
			int j = i +1;
			arry[i] ^= arry[j];
			arry[j] ^= arry[i];
			arry[i] ^= arry[j];
			
			//System.out.print(Arrays.toString(arry));		
		}
		
		return arry;
	}
}
