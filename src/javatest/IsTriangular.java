package javatest;

public class IsTriangular {

	public static void main(String[] args) {
		isTriangular(10);
		
	}
	
	static int isTriangular(int n) {
		int addJ = 0;
		int result = 0;
		if (n == 1) {
			result = 1;
			System.out.print(result);
			return result;
		}
		for (int j = 1; j < 10; j ++) {
			 addJ = addJ + j;
			if (n == addJ) {
				result = 1;
				System.out.print("Sure: " + result + " and this is J: " + j);
				return result;
			}
		}
		System.out.print(result);
		return result;
	}
}
