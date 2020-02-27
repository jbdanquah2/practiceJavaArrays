package javatest;

public class CountPerfectSquare {

	public static void main(String[] args) {
		int[] arr = {2,7,2,2};
		System.out.println(countPerfectSquare(arr));
	}
	
	public static int countPerfectSquare(int[] arr) {
		int len = arr.length;
		int sum = 0;
		int count = 0;
		if (len == 0 ) return count;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (arr[i] != arr[j] && arr[i] < arr[j] && arr[i] > 0 && arr[j] > 0 ) {
					sum = arr[i] + arr[j];
					if (IsPerfectSquare.isPerfectSquare(sum) == 1) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
	
	
	

}
