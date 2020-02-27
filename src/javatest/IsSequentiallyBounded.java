package javatest;

public class IsSequentiallyBounded {

	public static void main(String[] args) {
		int[] arry ={2, 3, 3, 99, 99, 99, 99, 99};	
		isSequentiallyBounded(arry);	
	}
	
	static int isSequentiallyBounded(int[] arry) {
		int result = 1;
		int count = 0;
		int len = arry.length;
		for (int i = 0; i < len-1; i++) {	
				if (arry[i] > arry[i+1]) {
					result = 0;
					System.out.print("Not in ascending order!");
					return result;
				}
		}
		
		for (int j = 0; j < len; j++) {
			for (int z = 0; z < len; z++) {
				if (arry[j] == arry[z]) {
					count++;
					break;
				}
			}
			if (count > arry[j]) {
				result = 0;
				System.out.println("Nope! Count: " + count + " Val is: " + arry[j] + " j: " +j);
				return result; 
			}
		}
		System.out.println("Yes! Count is: " + count + " and Result is: " + result);
		return result;
	}
}
