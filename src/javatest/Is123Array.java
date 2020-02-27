package javatest;

public class Is123Array {

	public static void main(String[] args) {
		int arry[] = {1, 2, 3,1,2,3,1,2,3} ;
		System.out.print(is123Array(arry));
	}
	
	static int is123Array(int[] arry) {
		int result = 0;
		int len =  arry.length;
		
		for (int i = 0, k = 1; i < len; i++, k++) {
			if (arry[i] != k) {
				result = 0;
				return result;
			}
			if (arry[i] == k ) {
				result = 1;
				 if (k == 3) {
					 k = 0;
				 }
				 
			}
		}
		return result;
	}

}
