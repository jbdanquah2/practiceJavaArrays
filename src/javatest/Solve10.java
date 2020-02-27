package javatest;

import java.util.Arrays;

public class Solve10 {

	public static void main(String[] args) {
		
		solve10();
	}
	
	static int[] solve10() {
		int[] result = new int[2];
		int iProd = 1;
		int jProd = 1;
		int tProd = 1;
		for (int z = 10; z > 0; z--) {
			tProd *= z;
		}
		//System.out.println(tProd);
		for (int i = 1; i <= 10; i++ ) {
			iProd *= i;
			for (int j = 1; j <= 10; j++) {
				
				jProd *= j;
				//System.out.println(i + ' ' + j);
				if (iProd + jProd == tProd) {
					result[0] = i;
					result[1] = j;
					System.out.println(Arrays.toString(result));
					return result;
				}
			}
		}
		//System.out.println(iProd);

		System.out.println(Arrays.toString(result));
		return result;
	}
}