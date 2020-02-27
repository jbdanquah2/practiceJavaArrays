package javatest;

public class NopeSmallest {

	public static void main(String[] args) {
		
		smallest(4);
	}
	
	static int smallest(int n) {
		int smallestNum = 1;
		
		for (int i = 1; i <= n; i++) {
			smallestNum = smallestNum * i;
			System.out.println(smallestNum % 10);
			if (smallestNum % 10 == 2) {
				System.out.println("heheh" + smallestNum);
			}
		}
		return 1;
	}		
}
