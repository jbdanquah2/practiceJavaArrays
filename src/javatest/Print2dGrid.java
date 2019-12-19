package javatest;

public class Print2dGrid {
	
	public static void main(String[] args) {
		int arry[][] = new int[10][10];
		for (int i = 0; i < 10; i++) {
			
			for ( int j = 0; j < 10; j++) {
				System.out.printf("%2d " , arry[i][j]);

			}
			System.out.println();
		}
	}
}
