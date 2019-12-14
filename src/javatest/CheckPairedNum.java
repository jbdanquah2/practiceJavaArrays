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
			return result;
				}
		for (int i = 0; i < arryLen; i++) {
			for (int j = 0; j < arryLen; j++) {
				if (i == j) continue;
				if (i + j == n) {
					if (arry[i] + arry[j] == n) {
						result = 1;
						return result;
					}
				}
				
			}
		}
		return result;
	}
}
