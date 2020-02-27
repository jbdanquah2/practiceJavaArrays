package javatest;
// Write a Java program to find smallest and second smallest elements of a given array
public class SmallestAndSecondSmallest {
	
	public static void main(String[] args) {
		int[] arry = {0,2,4,8,1,0};
		findSmallestAndSecondSmallest(arry);
	}
	
	static int findSmallestAndSecondSmallest(int[] arry) {
		int result = 0;
		int len = arry.length;
		int smallest = Integer.MAX_VALUE;
		int SecondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < len; i++) {
			if (arry[i] < smallest) {
				SecondSmallest = smallest;
				smallest = arry[i];	
				
			}
			if (arry[i] < SecondSmallest && arry[i] != smallest) {
				SecondSmallest = arry[i];
			}
			
		}
		
		System.out.println("Smallest: " + smallest + " SecondSmallest: " + SecondSmallest);
		return result;
	}
}
