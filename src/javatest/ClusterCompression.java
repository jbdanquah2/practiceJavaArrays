package javatest;

public class ClusterCompression {

	public static void main(String[] args) {
		int[] arry = {0, 0, 0, 2, 0, 2, 0, 2, 0, 0} ;
		clusterCompression(arry);
		
	}
	

	static int[] clusterCompression(int[] arry) {
		int len = arry.length;
		int res = 0;
		int count = 0;
		int[] result = new int[len]; 
		
		for (int i = 0, j = 1; i <= len-1; i++) {
			
			if (i == len-1) {
				j = 0;
			}
			
			if (arry[i] == arry[i+j]) {
				res = 1;
				continue;
			}
			if (arry[i+j] == arry[len-1]) {
				//System.out.println("This is : " + (i+j));
				//System.out.println("This is len-1 : " + (len-1));
				res = 1;	
				continue;
			}
			
			count = count + res;
		}
		
		System.out.println("This is count: " + count);
		return result;
	}
}
