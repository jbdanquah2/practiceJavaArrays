package javatest;

public class SumArrayValues {
	
	public static void main(String[] args) {
		int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		SumArrayValues sum = new SumArrayValues();
        sum.sumArray(arry);
	}
	
	public int sumArray(int[] arry) {
		int sum = 0;
		
		for (int i : arry) {
			sum += i;

		}
		
	
		System.out.println("sum of array members: " + sum);
		
		return sum;
	}
	
	
}
