package javatest;

public class OneBalanced {
	
	public static void main(String[] args ) {
		OneBalanced oneB = new OneBalanced();
		int[] arry = {1, 1, 1, 2, 3, -18, 45, 1} ;
		oneB.isOneBalanced(arry);
	}
	
	public int isOneBalanced(int[] arry) {
		int result = 0;
		int len = arry.length;
		
		if (len == 0 ) { // if array has no members	
			result = 1;
			return result;
		}
		
		for (int i = 0; i < len; i++) {
			if (arry[0] == 1 || arry[0] != 1) { 
				result = 1;
				if (arry[i] != 1) {
					result = 1;
					
					
				}
			}
		}
		
		
		return result;
	}
}
