package javatest;

import java.util.Arrays;

public class SegreagteZerosAndOnes {

	public static void main(String[] args) {
		int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		segregateArry(nums);

	}
	
	static int segregateArry(int [] arry) {
		int result = 0;
		int len = arry.length;
		int left = 0;
		int right = len-1;
		
		while (left < right) {
			while (arry[left] == 0 && left < right) {
				left++;
			}
			while (arry[right] == 1 && left < right) {
				right--;
			}
			
			if (left < right) {
				result = 1;
				arry[left] = 0;
				arry[right] = 1;
				
				left++;
				right--;
			}
			
			
		}
		
		System.out.println("array: " + Arrays.toString(arry));		
		return result;
	}

}
