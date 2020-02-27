package javatest;

public class IsIsolated {

	public static void main(String[] args) {
		int[] arry = {1, 1, 11, 1111, 1111111};
		isIsolated(34);

	}
	
	static int isIsolated(long num) {
		int result = 1;
		
		long sqr = num * num;
		long cube = num * num * num;
		long n1 = 0, n2 = 0;
		if (num > 2097151 || num < 1) {
			System.out.println("Number is more long: " + num);
			result = -1;
			return result;
		}
		
		while (sqr > 0) {
			 n1 = sqr % 10;
			while ( cube > 0) {
				n2 = cube % 10;
				if (n1 == n2 ) {
					result = 0;
					System.out.println("this is not Isolated: " + n1 +" " + n2);
					return result;
				}
				System.out.println("n1: "+n1 +" n2: "+ n2);
				cube = cube/10;
				
			}
			sqr = sqr/10;
			
		} // 1156    39304
		
		
		System.out.println("this is Isolated: " + n1 +" " + n2);
		return result;
	}
		
}
