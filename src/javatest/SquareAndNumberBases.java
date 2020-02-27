package javatest;

public class SquareAndNumberBases {
	
	public static void main(String[] args) {
		int num = 9;
		isSquare(num);
		int[] arry = {3,7,1}; 
		int n = 6;
		convertToBase10(arry, n);
		
		isLegalNumber(arry,n);
	}
	
	static int isSquare(int num) {
		
		int i = 0;
		int result = 0;
		
		if (num < 0) {
			System.out.println(result + "  is: " + i);
			return result;
		}
		for ( i = 0; i < num; i++) {
			if (i * i == num) {
				result = 1;
				break;
			}
			
		}
		System.out.println(result + " Sqrt is: " + i);
		return result;
	}
	
	static int isLegalNumber(int[] arry, int base) {
		int result = 1;
		int len = arry.length;
		if (len == 0 || base == 0 ) {
			result = 0;
		}
		for (int i = 0; i < len; i++) {
			if (arry[i] >= base ) {
				result = 0;
				break;
			}
		}
		System.out.println("This: " + result);
		return result;
	}
	 
	static int convertToBase10(int[] arry, int base) {
		int len = arry.length;
		int result = 0;
		int ans = 0;
		
		if (isLegalNumber(arry, base) == 1) {
			result = 1;
			for (int i = 0, j = len-1;  j >= 0; i++, j--) {
				ans += (arry[j] * (Math.pow(base, i))) ;
			}
		}else {
			System.out.println("answer is: " + ans + " this is result: " + result);
			return result;
		}
		
		System.out.println("answer is: " + ans + " this is result: " + result);
		return ans;
	}
}
