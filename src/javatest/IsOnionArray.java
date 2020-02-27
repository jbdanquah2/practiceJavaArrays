package javatest;

public class IsOnionArray {

	public static void main(String[] args) {
		int[] arr  = {1, 2, 19, 4, 5};
		
		System.out.println(isOnionArray(arr));
	}
	
	public static int isOnionArray(int[] arr) {
		int result = 1;
		int len = arr.length;
		
		if (len < 2) {
			return result;
		}
		
		for (int j = len-1, k = 0; j >= 0; j--, k++) {
			
			if (j != k && j >=0 && k >= 0 ) {
				if (j + k + 1 == len) {
					if ( arr[j]+arr[k] > 10 ) {
						result = 0;
						System.out.println("j:" + j + " k: " + k);
						System.out.println("arr[j]: " + arr[j] + " arr[k]: " + arr[k]);
						return result;
					}
				}
				
			};
		}
		
		
		return result;
	}

}
