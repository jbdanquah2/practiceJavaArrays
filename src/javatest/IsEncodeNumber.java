package javatest;

public class IsEncodeNumber {

		 public static void main(String[] args) {
		  int n = 14, i = 2, count = 0, pfNum = 0, k = 0;
		  int[] result;
		  int orgN = n;
		  if (n <= 1) return;
		  while (n != 1) {
			  System.out.println(n);
		   while (n % i == 0) {
		    for (int j = 2; j <= i; j++) {
		     if (i % j == 0) {
		      count++;
		      System.out.println("count: "+ count);
		     }
		    }
		    if (count == 1) {
		     pfNum++;
		     System.out.println("pfNum: "+ pfNum);
		    }
		    count = 0;
		    n = n / i;
		   }
		   i++;
		  }

		  result = new int[pfNum];
		  n = orgN;
		  i = 2;

		  while (n != 1) {
		   while (n % i == 0) {
		    for (int j = 2; j <= i; j++) {
		     if (i % j == 0) {

		      count++;
		     }
		    }
		    if (count == 1) {
		     result[k] = i;
		     k++;

		    }
		    count = 0;
		    n = n / i;
		   }
		   i++;
		  }
		  	for (int l = 0; l < result.length; l++) {
		  			System.out.println(result[l]);
		}
	}
}

