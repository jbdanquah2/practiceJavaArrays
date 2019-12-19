package javatest;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] arry = {200, 14, 56, 45, 1, 56, 77, 18, 9, 900};
		MaxAndMin mm = new MaxAndMin();
		mm.findMaxAndMin(arry);
	}
	
	public int findMaxAndMin(int[] arry) {
		int max = arry[0];
		int min = arry[0];
		int len = arry.length;
		for (int i = 1; i < len - 1; i++) {
			
			
			if (arry[i] > arry[i + 1]) {
				if (arry[i] > max) max = arry[i];
				if (arry[i + 1] < min) min = arry[i + 1];
			}
			if (arry[i] < arry[i + 1]) {
				if (arry[i] < min) min = arry[i];
				if (arry[i + 1] > max) max = arry[i + 1];
			}
//			if (i + 1 > len) {
//				if (arry[i] > max) max = arry[i];
//				if (arry[i] < min) min = arry[i];
//			}
		}
		
		
		System.out.println(max + "  " + min);	
		return 1;
	}
}
