package javatest;

public class Vanilla {
 // this is the better solution than the
// solution in the IsVanilla.java class
	
	public static void main(String[] args) {
		int[] arr =  {-999, 999, 999, 99999};
		System.out.println(isVanilla(arr));
	}
	
	static int isVanilla(int[] arr) {
		int result = 1;
		int len = arr.length;
				
		if (len == 0) {
			result = 0; 
			return result;
		}
		
		int ele =Math.abs(arr[0] % 10) ;
		
		for(int i = 0; i < len; i++) {
			int n = Math.abs(arr[i]) ;
			while(n > 0) {
				if (ele != n % 10) {
					result = 0;
					System.out.println("result: " +result + " n%10: " + (n % 10));
					return result;
				}
				n /= 10;
			}
		}
		
		return result;
	}
}
