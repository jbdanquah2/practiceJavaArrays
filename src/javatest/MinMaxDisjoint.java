package javatest;

public class MinMaxDisjoint {

	public static void main(String[] args) {
		int[] arry = {1};
		isMinMaxDisjoint(arry);
		
	}
	
	static int isMinMaxDisjoint(int[] arry) {
		int result = 1;
		int len = arry.length;
		if (len <= 1 ) {
			result = 0;
	  		System.out.println("Not a minmax-disjoint array: " + result);
	  		return result;
		}
		int min = arry[0];
		int max = arry[0];
		int countMax = 0;
		int countMin = 0;
		
		for (int i = 0; i < len-1; i++) {
			if (arry[i] > arry[i+1]) {
				if (arry[i] > max) max = arry[i];
				if (arry[i+1] < min) min = arry[i+1];
			}
			
			if (arry[i] < arry[i+1]) {
				if (arry[i] < min) min = arry[i];
				if (arry[i+1] > max) max = arry[i+1];
			}
		}
		
		for (int val : arry) {
			if (val == max ) {
				countMax++;
			}
			if (val == min) {
				countMin++;			
			}
		}
		
		for (int j = 0; j < len; j++) {
			if (arry[j] == max) {
			  	if (arry[j+1] == min) {
			  		result = 0;
			  		System.out.println("Min and Max are adjacent: " + result);
			  		return result;
			  	}
			}
			if (arry[j] == min) {
				if (arry[j+1] == max) {
					result = 0;
					System.out.println("Min and Max are adjacent: " + result);
			  		return result;
				}
			}
		}
		
		if (max == min || countMax > 1 || countMin > 1) {
			result = 0;
			System.out.println("Not minmax-disjoint arry. Max: " + max + " Min: " + min);
			System.out.println("result: " + result);
			return result;
		}
		System.out.println("count Max: " + countMax + " count Min: " + countMin);
		System.out.println("result: " + result);
		return result;
	}
}

