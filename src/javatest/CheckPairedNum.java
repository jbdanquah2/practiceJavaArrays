package javatest;
//import java.util.*;

public class CheckPairedNum {
	
	
	public static void main(String[] args) {
		int[] arry = {3};
		CheckPairedNum pn = new CheckPairedNum();
		pn.isPaired(arry, 3);
	}
	
	public int isPaired(int arry[], int n) {
		int result = 0;
		int arryLen = arry.length;
		if (arryLen == 0 || n == 0) {
			System.out.println("Arry is empty or result is zero: " + result); 
			return result;
				}
		for (int i = 0; i < arryLen; i++) {
			for (int j = 0; j < arryLen; j++) {
				if (i == j) continue;
				if (i + j == n) {
					if (arry[i] + arry[j] == n) {
						result = 1;
						System.out.println("this is " +arry[i]+ " value i is: "+ i + " and this is " + arry[j] + " value j is: " + j);
						return result;
					}
				}
				
			}
		}
		System.out.println("this is the result: " + result);
		return result;
	}
}
