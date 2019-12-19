package javatest;

import java.util.*;

public class NumberOfPrimeNumbers {
	
	public static void main(String[] args) {
		NumberOfPrimeNumbers nP = new NumberOfPrimeNumbers();
		nP.primeCount(-10,6);
	}
	
	public int primeCount(int start, int end) {
		//NumberOfPrimeNumbers nPP = new NumberOfPrimeNumbers();
		List<Integer> arry = new ArrayList<>();
		int count = 0;
		if ( start > end) {
			return 0;
		}
		if (start < 0) {
			start = 0;
		}
		
		for ( int i = start; i <= end; i++) {
				
			if (isPrime(i) == 1) {
				count += 1;	
				arry.add(i);
			}
		}
		System.out.println("Count is: " + count + arry);
		return count;
	}
	
	public int isPrime(int num) {
		int check = 1; // variable to look out for 
		
		if (num <= 1) {
				check = 0;
				return check;
			}
			for (int i = 2; i <= num/2; i++) { // loops to divide the number;
				if (num % i == 0 ) { // checks if number is divisible by i;
					
					check = 0;
					
				}
			}
			

		return check;
	}
	
	
}
