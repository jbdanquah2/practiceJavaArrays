package javatest;

public class Fibonacci {
	public static void main(String[] args) {
		int num = 34;
		
		Fibonacci fibo = new Fibonacci();
		fibo.isFibonacci(num);
	}
	
	public int isFibonacci(int num) {
		int n1 = 1, n2 = 1, n3 = 0;
		int result = 0;
			if (num <= 0) {
				System.out.println("shagaeee!! " + result);
				return result;
			}
			
			for (int i = 2; i <= num; i++) {
				n3 = n1 +n2;
				
				n1 = n2;
				n2 = n3;
				
				if (n3 == num) {
					 result = 1;
					 System.out.println("n3: " +  n3);
				 }
				// System.out.println("hello");
			}
			System.out.println(result);
		return result;
	}
}
