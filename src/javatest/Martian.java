package javatest;

public class Martian {

	public static void main(String[] args) {
		int[] arry  = {1, 3} ;
		Martian mars = new Martian();
		mars.isMartian(arry);
	}
	
	public int isMartian(int[] arry ) {
		int result = 1;
		int countOnes = 0;
		int countTwos = 0;
		int len = arry.length;
		if (len == 0 || (len == 1 && arry[0] != 1)) { 
			result = 0;
			System.out.println("before the loop: " + result);
			return result; 
		}
		if (len == 1 && arry[0] == 1) {
			System.out.println("array has one: " + result);
			return result;
		}
		
		for (int i = 0; i < len-1; i++) {
			if (arry[i] == arry[i+1]) {
				result = 0;
				System.out.println("in the loop:" + result);
				return result;
			} 
			if (arry[i] == 1 || arry[len-1] == 1) {
				countOnes += 1;
			}else if (arry[i] == 2 || arry[len-1] == 2) {
				countTwos += 1;
			}			
		}
	if (countTwos >= countOnes) {
		result = 0;
		System.out.println("last but one: " + result);
		return result;
	}
		System.out.println("last:" + result);	
		return result;
	}
	
	
}
