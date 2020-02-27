package javatest;

import java.util.Arrays;

public class AreAnagram {

	public static void main(String[] args) {  
		char[] arry1 = {'p', 'o', 'o', 'l'};
		char[] arry2 = {'p', 'o', 'l', 'l'};
		areAnagram(arry1, arry2);
	}

	static int areAnagram(char[] arry1, char[] arry2) {
		int result = 0;
		int len1 = arry1.length;
		int len2 = arry2.length;
	
		if (Arrays.equals(arry1, arry2)) {
			result = 1;
			System.out.print(result);
			return result;
		}
		
		if (len1 != len2) {
			result = 0;
			System.out.print(result);
			return result;
		}
		
		char[] newArry1 = new char[len1];
		char[] newArry2 = new char[len2];
		
		for (int i = 0; i < len1; i++) {
			newArry1[i] = arry1[i];
			newArry2[i] = arry2[i];
		}
		
		Arrays.sort(newArry1);
		Arrays.sort(newArry2);
		
		if (Arrays.equals(newArry1, newArry2)) {
			result = 1;
			System.out.println(Arrays.toString(newArry1));
			System.out.println(Arrays.toString(newArry2));
		}
		System.out.println(Arrays.toString(newArry1) + " " + Arrays.toString(arry1));
		System.out.println(Arrays.toString(newArry2) + " " + Arrays.toString(arry2));
		System.out.println("last: " + result);
		return result;
	}
}
