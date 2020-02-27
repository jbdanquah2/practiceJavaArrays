package javatest;

public class IsVanilla {
	
// this is a very bad solution
/// a better solution in class Vanilla.java
	
	public static void main(String[] args) {
		int[] arry = {1, 1, 11, 111, 1111111};
	
		isVanilla(arry);
	}
	
	static int isVanilla(int[] arry) {
		int result = 1;
		int len = arry.length;
		int n1 = 0;
		if (len == 0 ) {
			result = 0;
			System.out.println("This is not vanilla. Length is zero ");
			return result;
		}
		for (int mem : arry) {
			n1 = Math.abs( mem % 10);
			for (int i = 0; i < len; i++) {
				if (n1 != Math.abs(arry[i] % 10)) {
					result = 0;
					System.out.println("This is not vanilla " + n1 + "... " + arry[i] % 10);
					return result;
				}
			}
		}
		
		
		
		System.out.println("This is vanilla " + n1);
		
		return result;
	}
	
	
	
}
