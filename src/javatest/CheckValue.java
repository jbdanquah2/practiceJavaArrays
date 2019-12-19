package javatest;

public class CheckValue {
	
	public static void main(String[] args) {
		int[] arry = { 1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
		
		CheckValue cv = new CheckValue();
		cv.getValue(arry, 145);;
	}
	
	public int getValue(int[] arry, int val) {
		int result = 0;
		for (int i : arry) {
			if (i == val) {
				result = 1;
			}
		}
		System.out.println(result);
		return result;
	}
}
