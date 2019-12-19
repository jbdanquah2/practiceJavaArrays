package javatest;

import java.util.Arrays;

public class RemoveArrayElement {
	
	public static void main(String[] args) {
		int[] arry = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		RemoveArrayElement rem = new RemoveArrayElement();
		rem.removeElement(arry, 4);
	}
	
	public int[] removeElement(int[] arry, int index) {
		
		for (int i = index; i < arry.length-1; i++) {
				arry[i] = arry[i+1];
		}
		System.out.println(Arrays.toString(arry));
		return arry;
	}
}
