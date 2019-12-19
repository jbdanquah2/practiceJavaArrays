package javatest;

public class ArrayAverage {

	public static void main(String[] args) {
		int[] arry = {1,2,3,11};
		ArrayAverage aa = new ArrayAverage();
		aa.getAverage(arry);
		
	}
	
	public double getAverage(int[] arry) {
		int len = arry.length;
		double sum = 0;
		double average = 0;
		for (double i : arry) {
			sum += i;
		}
		average = sum / len;
		System.out.println(average);
	return average;
	}
}
