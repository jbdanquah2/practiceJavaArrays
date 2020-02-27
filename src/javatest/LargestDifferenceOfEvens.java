package javatest;

public class LargestDifferenceOfEvens {

	public static void main(String[] args) {
		int[] arry = {-2, 3, 4, 9};
		largestDifferenceOfEvens(arry);
		
	}
	
	static int largestDifferenceOfEvens(int[] arry) {
		int result = -1;
		int largest = 0;
		int diff = 0;
		int count = 0;
		int len = arry.length;
		
		if (len <= 1) {
			System.out.println("Too few members: " + result);
			return result;
		}
		
		for (int n : arry) {
			if (n % 2 == 0) {
				count += 1;
			}
		}
		
		if (count < 2) {
			System.out.println("count is less that 2: " + count + " result: " + result);
			return result;
		}
		int max = 0;
		for (int i = 0; i < len; i++) {		
			if (arry[i] % 2 == 0) {
				for (int j = 0; j < len; j++) {
					if (arry[j] % 2 == 0) {
						diff = arry[i] - arry[j];
						largest = max;
						max = diff;
						if (max > largest) {
							//System.out.println("largest: " + largest);
							result = max;
							break;
						}else {
							//System.out.println("max: " + max);
							result = largest;
							break;
						}
					
					}
				}
				
			}
		}
		
		System.out.println("result: " + result);
		return result;
	}

}
