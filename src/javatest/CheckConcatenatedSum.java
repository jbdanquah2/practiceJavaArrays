package javatest;

public class CheckConcatenatedSum {

	public static void main(String[] args) {
		System.out.println(checkConcatenatedSum(2997  , 0));
		
	}

	private static int checkConcatenatedSum(int n, int catlen) {
		int result = 0;
		int p = n;
		int sum = 0;
		String cat = "";
		if (n == 0 || catlen == 0) return result;
		
		while (p > 0) {
			int mod = p % 10;
			for (int i = 1; i <= catlen; i++) {
				cat += mod;
			}
			p /= 10;
			 sum += Integer.parseInt(cat);
			 cat = "";
			
		}
		
		if (sum == n) {
			result = 1;
			return result;		
		}
		System.out.println(sum);
		return result;
	}

}

