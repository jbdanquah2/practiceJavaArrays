package javatest;

import java.util.ArrayList;
import java.util.Arrays;

public class GuthrieSequence {
	
	public static void main (String[] args) {
		int[] arry = {7,  22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2,1};
	System.out.println(isGuthrieSequence(arry));	
	}
	
	
	
	public static int isGuthrieSequence (int[] arry) {
		ArrayList<String>myList = new ArrayList<String>();
		int num = arry[0];
		int a = 0;
		while (num > 1) {
			if (num % 2 == 0) {
				num = num / 2;
			a = 1;
			}else {
				num = num * 3 + 1;
			a = 0;
			}
		myList.add(String.valueOf(num));
		
		}
		System.out.println(myList);
	return a;
	}
	
	
}
