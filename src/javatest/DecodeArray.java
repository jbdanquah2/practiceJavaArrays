package javatest;

public class DecodeArray {

	public static void main(String[] args) {
		int arr[] = {9, 5, 8, 17, 15};		
		System.out.println(decodeArray(arr));
		
	}
	
	public static int decodeArray(int[] arr) {
		String sNum = "";
		int num = 0;
		int result = 0;
		boolean flag = false;
		int len = arr.length;
		if (len < 2) return 0;
		
		if (arr[0] < 0) flag = true;
		
		for (int i = 0; i < len-1; i++) {
			int n = arr[i] - arr[i+1];
			sNum += Math.abs(n) ;
			num = Integer.parseInt(sNum);
		}
		if (flag) num *= -1;
		System.out.println(num);
		return num;
	}

}
