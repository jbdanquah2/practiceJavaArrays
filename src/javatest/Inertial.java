package javatest;

public class Inertial {
	
	public static void main(String[] args) {
		int[] arr = {1,2};
		System.out.println(isInertial(arr));	
	}
	public static int isInertial(int[] arr) {
		int result = 0;
		int checkOdd = 0;
		int max = 0;
		int len = arr.length;
		if (len == 0) return result;
		for (int n : arr) {
			if (n > max) {
				max = n;
				result = 1;
			}
		}
		
		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 != 0) {
				checkOdd = 1;
				result = 1;
				for (int j = 0; j < len; j++) {
					if ((arr[j] % 2 == 0) && (arr[j] > arr[i]) && (arr [j] != max)) {
						result = 0;
						return result;
					}
				}
			}
			
		}
		if (max % 2 == 1 || checkOdd == 0) {
			result = 0;	
		}
		
		
		return result;
	}
}
