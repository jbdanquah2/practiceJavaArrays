package javatest;

public class Array235 {

	public static void main(String[] args) {
		int[] arry = {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7};
		Array235 arr = new Array235();
		arr.is235Array(arry);
		
	}
	
	public int is235Array(int[] arry) {
		int count2 = 0;
		int count3 = 0;
		int count5 = 0;
		int countNone = 0;
		int len = arry.length;
		for (int i = 0; i < len; i++) {
			
			if (arry[i] % 2 == 0) count2 += 1;
			if (arry[i] % 3 == 0) count3 += 1;
			if (arry[i] % 5 == 0) count5 += 1;
			if (arry[i] % 2 != 0 && arry[i] % 3 != 0 && arry[i] % 5 != 0) countNone += 1;
		}
		
		if ((count2 + count3 + count5 + countNone) == len) {
			System.out.println("Yes " + (count2 + count3 + count5 + countNone) + " and array length is: " + len);
			return 1;
		}
		
		System.out.println("nope... not not:.. " + (count2 + count3 + count5 + countNone) + " and array length is: " + len);

		return 0;
	}
}
