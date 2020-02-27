package javatest;

public class IsLargestAdjacentSum {

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,1,1,1,1};
		System.out.println(largestAdjacentSum(arr));
	}
	
	static int largestAdjacentSum(int arr[]) {
		int largestSum = 0;
		int len = arr.length;
		if (len < 2) return 0;
		
		for (int i = 0; i < len-1; i++) {
			int sum = arr[i] + arr[i+1];
			if(sum > largestSum) {
				largestSum = sum;
				
			}
		}
		
		
		
		
		return largestSum;
	}

}
