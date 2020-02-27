package javatest;

public class IsSystematicallyIncreasing {

	public static void main(String[] args) {
		
		int[]  arry = {1, 1, 2};
		isSystematicallyIncreasing(arry);

	}
	
	static int isSystematicallyIncreasing(int[] arry) {
		int result = 0;
		int len = arry.length;
		
		if (len < 1) {
			result = 0;
			System.out.print(result);
			return result;
		}
		
		for (int i = 0; i < len; i++) {
			if (arry[i] == 1 ) {
				if (len == 1) {	
					result = 1;
					System.out.println("cool: " + result);
					return result;
				}
				
				if (len > 1) {
					for (int m : arry) {
						for (int j = 1; j < len; j++) {
							if (m == j) {
								result = 1;
								//System.out.println("ok: " + result);
								System.out.println("m: " + m + " = j: " + j);
							}else {
								result = j;
								System.out.println("m is: " + m + " j is: " + j);
								return result;
							}
							
						}
					}				
				}
			}
			
		}
		
		System.out.println("final result:" + result);
		return result;
	}

}
