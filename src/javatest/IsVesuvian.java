package javatest;

public class IsVesuvian {

	public static void main(String[] args) {
		
		isVesuvian(50);
	}
	
	static int isVesuvian(int num) {
		int result = 0;
		int i2 = 0, j2 = 0;
		int m2 = 0, n2 = 0;
		int count = 0;
		
		for (int i = 1; i <= 789; i++) {
			
				i2 = i * i; 
			for (int j = 1; j <= 789; j++) {
				j2 = j * j;
				if (num == i2 + j2 )  {			
						count++;
					for (int m = 1; m <= 789; m++) {
						if (m != i && m != j) {
							m2 = m * m;
							
						}
						for (int n = 1; n <= 789; n++) {
							if (n != i && n != j) {
								n2 = n * n;
							}
							
							if ((num == m2 + n2) && (n2 != i2 && m2 != j2)) {
								count++;
								result = 1;
								System.out.println("result: " + result + " i2: " + i2 + " j2: " + j2 + " count: " + count);
								System.out.println("result: " + result + " m2: " + i2 + " n2: " + j2 + " Count: " + count);
								//return result;
							}
						}
					}
						
				}
				
			}
		}
		System.out.println("resultl: " + result + " i2: " + i2 + " j2: " + j2 + " Count: " + count);
		System.out.println("resultl: " + result + " m2: " + i2 + " n2: " + j2 + " Count: " + count);
		return result;
	}
}
