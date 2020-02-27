package javatest;

public class IsSumSafe {

	public static void main(String[] args) {
		int[] arry = {5, -5, 0};
		isSumSafe(arry);
	}
	
    static int isSumSafe (int[] arry) {
    	int result = 1;
    	int len = arry.length;
    	int sum = 0;
    	for (int val : arry) {
    		sum += val;
    	}
    	
    	for (int i = 0; i < len; i++) {
    		if (arry[i] == sum) {
    			result = 0;
    			break;
    		}
    	}
    	
    	System.out.println("this is result: " + result +  " ...And this sum of array members: " + sum);
    	return result;
    }
}
