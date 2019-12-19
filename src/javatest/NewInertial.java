package javatest;

public class NewInertial {

	public static void main(String[] args) {
		NewInertial iner = new NewInertial();
		int[] arry = {1, 1, 1, 1, 1, 1, 2};
		iner.isInertial(arry);
	}
	
	public int isInertial(int[] arry) {
		int result = 1;
		int maxVal = 0;
		int len = arry.length;
		if (len <= 1) {
			result = 0;
		return result;	
		}
		
		for (int i = 0; i < len; i++) {
			if (arry[i] % 2 != 1) {
				result = 0;
				System.out.println("Here comethsds " + result);
				return result;
			}
			if (arry[i] > maxVal && arry[i] % 2 == 0) {
				maxVal = arry[i];
				for ( int j = 0; j < len; j++) {
					if (arry[j] % 2 == 1 && arry[j] < maxVal) {
						result = 1;
					}
					
				}
				
			}
			
		}
		System.out.println("Here come " + result);
		return result; 
	}
}
