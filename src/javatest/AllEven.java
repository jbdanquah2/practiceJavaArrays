package javatest;

public class AllEven {
	
	public static void main(String[] args) {
		AllEven check = new AllEven();
		int[] arry = {8, 21, 8};
		check.allEven(arry, 3);
	}
	
	public int allEven(int arry[], int len) {
		int result = 1;
		if (len <= 0) return 0;
		for (int i = 0; i < len; i++) {
			if (arry[i] % 2 != 0) {
				result = 0;
				System.out.println("This issss: " +result);
				return result;
				
			}
					
		}
		System.out.println("This is: " + result);
		return result;
	}
}
