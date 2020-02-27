package javatest;

public class Trivalent {

	public static void main(String[] args) {
		int[] arry = { 2147483647, -1, -1,-2147483648};
		
		isTrivalent(arry);
		
	}
	
	static int isTrivalent(int[] arry) {
		int result = 1;
		int count = 0;
		int len = arry.length;
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (arry[i] == arry[j] && i != j ) { // checks if element is same with different index and skips counting
				
					break;
				}
				
				if (arry[i] == arry[j] && i == j ) {// checks if element is same and has same index and then counts it
					count++;				
				}
				
				
			}
		}
		
		if ( count != 3) { // checks if count does not equal 3
			result = 0;
			System.out.println("this is not Trivalent! Count is: "  + count + " Result: " + result);
			return result;
		}
		
		System.out.println("This is Trivalent! Count is: "  + count +" and Result: " + result );
		return result;
	}
}
