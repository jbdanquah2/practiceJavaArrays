package javatest;
//import java.util.*;

public class CheckPairedN {
		
	public static void main(String[] args) {
		int[] arry = {10, 4, 2, 4, 8, 6};
		isPaired(arry, 5);
	}
	
	static int isPaired(int arry[], int n) {
		int result = 0;
		int arryLen = arry.length;
		if (arryLen == 0) return 0;
		for (int i = 0; i < arryLen; i++) {
			for (int j = 0; j < arryLen-1; j++) {
				if (i == j) continue;
				if (i + j == n && arry[i] + arry[j] == n) {
					result = 1;
					break;
				}
			}
		}
		System.out.println(result);
		return result;
	}
}
