package javatest;

public class DecodeBitArray {

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1,0,0,0,0,1};
		System.out.println(decodeArray(arr));
	}
	
	public static int decodeArray(int[] arr) {
		int result = 0;
		boolean neg = false;
		int count = 0;
		String sNum = "";
		int num = 0;
		boolean flag = false;
		int len = arr.length;
		if (arr[len-1] != 1) return 0;
		
		if (arr[0] < 0) flag = true;
		neg = flag;
		for (int j = 0; j < len; j++) {
			if (flag) {
				flag = false;
				continue;
			}
			if (arr[j] == 1) {
				//count++;
				sNum += count;
				count = 0;
				continue;
			}
		count++;
		
		}
		num = Integer.parseInt(sNum);
		if (neg) num *= -1;
		//System.out.println(num);
		
		return num;
	}

}
