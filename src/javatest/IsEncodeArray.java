package javatest;

import java.util.Arrays;

public class IsEncodeArray {

	public static void main(String[] args) {
		
		System.out.println(isEncodeArray(469));
	}
	
	public static int[] isEncodeArray(int n) {
		boolean flag = false;
		int size = 0;
		if (n < 0 ) {
			size = 1;
			flag = true;
		}
		if (n == 0) size = 1;
		int p = Math.abs(n);
		
//		for (; p > 0; ) {
//			int mod = p % 10;
//			size += mod + 1;
//			p = p / 10;
//			
//		}
		
		while (p > 0 ) {
			int mod = p % 10;
			size += mod + 1;
			p = p /10;
		}
		
		int[] arry = new int[size];	
		
		for (int i = size - 1; i >= 0; i--) {
			n = Math.abs(n);
			int m = n % 10;
			int x = 1;
			if (n == 0 || m == 0) {
				arry[i] = 1;
			}
			if (flag) {
				arry[0] = -1;
			}
			while (m > 0) {
				arry[i] = x;
				x = 0;
				m--;
				i--;
			}
			n = n / 10;
		}
		
		
		System.out.println(Arrays.toString(arry));
			
		return arry;
	}

}
