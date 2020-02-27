package javatest;

public class FindPorcupineNumber {

	public static void main(String[] args) {

		System.out.println(findPorcupineNumber(0));
	}
 
	public static int findPorcupineNumber(int n) {
		int pNum = 0;
		for (int i = n+1; i < 500; i++) {
		
			if (IsPrime.isPrime(i)) {
				if (i % 10 == 9) {
					pNum = i;
					for (int j = pNum+1; j < 500; j++) {
						if (IsPrime.isPrime(j)) {
							if (j % 10 == 9) {
								pNum = j;
								break;
							}
						}
					}
				}				
			}
		}	
		return pNum;
	}
}
