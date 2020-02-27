package javatest;

public class Array123 {

	public static void main(String[] args) {
		int[] arr = {0,1, 2, 3, 1, 2, 3, 1, 2, 3};
		is123Array(arr);
	}
	
	static int is123Array (int[] arr) {
		int result = 0;
		int len = arr.length;
		if (len % 3 != 0) {
			result = 0;
			System.out.println(result);
			return result;
		}
		if (arr[0] != 1 || arr[len-1] != 3) {
			result = 1;
			System.out.println(result);
			return result;
		}
		
		for (int i = 0, j = 1; i < len; i++,j++) {
			if (arr[i] != j) {
				result = 0;
				System.out.println(result);
				return result;
			}
			
			if (j == 3) {
				result = 1;
				j = 0;
			}
		}
		
		System.out.println(result);
		return result;
	}
	
}
