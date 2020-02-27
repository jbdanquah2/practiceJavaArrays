package javatest;

public class ClosestToZero {

	public static void main(String[] args) {
		int[] arry = {1, 5, -4, 7, 8, -6};
		findClosestToZero(arry);
	}
	
	static int findClosestToZero(int[] arry) {
		int n1= 0;
		int n2 = 1;
		int sum = 0;
		int closeSum = 0;
		int len = arry.length;
		
		closeSum = arry[n1] + arry[n2];
		
		for (int i = 0; i < len; i++) {
			for (int j = i+1; j < len; j++) {
				closeSum = sum;
				sum = arry[i] + arry[j];
				if (Math.abs(closeSum) > Math.abs(sum)) {
					closeSum = sum ;
					n1 = i;
					n2 = j;
					continue;
				}
			}
			
		}
		System.out.println("sum: " +  closeSum + " n1: " + arry[n1] + " n2: " + arry[n2]);
		return sum;
	}

}
