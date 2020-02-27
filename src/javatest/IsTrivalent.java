package javatest;

import java.util.Arrays;

public class IsTrivalent {

	public static void main(String[] args) {
		int[] arr = {2147483647, -1, -1 , -2147483648};
		System.out.println(isTrivalent(arr));
	}
	
	static int isTrivalent(int[] arr) {
		int result = 0;
		int len = arr.length;
		int count = 1;
		if (len == 0) {
			return result;
		}
		
		int[] newArr = new int[len];
		for (int i = 0; i < len; i++) {
			newArr[i] = arr[i];
		}
		Arrays.sort(newArr);
		for (int j = 0; j < len-1; j++) {
			if (newArr[j] != newArr[j+1]) {
				count++;
			}
		}
		
		if (count == 3) {
			result = 1;
			return result;
		}
		return result;
	}
}
