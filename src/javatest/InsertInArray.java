package javatest;

import java.util.Arrays;

public class InsertInArray {

	public static void main(String[] args) {
		int[] arry = {25, 14, 56, 15};
		int el = 33;
		int index = 2;
		
		InsertInArray ia = new InsertInArray();
		ia.insertElement(arry, el, index);
	}
	
	public int insertElement(int[] arry, int el, int index) {
		
		arry[index] = el;
		
		System.out.println(Arrays.toString(arry));
		
		return 1;
	}
}
