package javatest;

import java.util.Arrays;

public class NValues {

	public static void main(String[] args) {
		int[] arr = {};
		int num = 1;
		hasNValues(arr, num);
	}
	
	static int hasNValues(int[] arr, int n) {
		int result = 0;
		int len = arr.length;
		int[] newArr = new int[len];
		int count = 1;
		for (int i = 0; i < len; i++) {
			newArr[i] = arr[i];
		}
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));
		for (int j = 0; j < len-1; j++) {
			if (newArr[j] != newArr[j+1]) {
				count += 1;
			}
		}
		if (count == n) {
			result = 1;
		}else {
			result = 0;
		}
		System.out.println(count);
		System.out.println(result);
		return result;
	}
}
