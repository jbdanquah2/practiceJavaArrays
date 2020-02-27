package javatest;

import java.util.Arrays;

public class EncodeArray {

	public static void main(String[] args) {
		int n = 4392;
		
		encodeArray(n);	
	}
	
	static int[] encodeArray(int n) {
		int m = 0;
		int flag = 0;
		if (n < 0) {
			flag = 1;
			m = 1;
			n = Math.abs(n);
		}
		int p = n;
		int y = 0;
		if (p == 0) m = 1;
		while ( p > 0) {
			{		
				y = p % 10;
				 m += y + 1;
				 
				p = p / 10;	 
			}
			
		}
		System.out.println(m);
		int[] result = new int[m] ;

		for (int j = m - 1; j >= 0; j-- ) {
			int mod = n % 10;
			System.out.println("mod: " + mod);
			int x = 1;
			if (mod == 0) {
				x = 1;
				result[j] = x;
			}
			if (mod == 0 && flag == 1) {
				x = -1;
				result[j] = x;
			}
			while (mod > 0) {
				
				result[j] = x;
				x = 0;
				mod--;
				j--;
			}
			n = n / 10;
		}
		
		
		System.out.println(Arrays.toString(result));
		return result;
	}

}
