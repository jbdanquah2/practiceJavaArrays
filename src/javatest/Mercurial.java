package javatest;

public class Mercurial {
	
	public static void main(String[] args) {
		int[] arry = {8, 2, 1, 1, 18, 3, 5};
		Mercurial mer = new Mercurial();
		mer.isMercurial(arry);
	}
	
	public int isMercurial(int[] arry) {
		
		int result = 1;
		int len = arry.length;
		if (len == 0 || (len == 1 && arry[0] == 1) ) {
			result = 1;
			System.out.println("Gocha " + result);
			return result;
		}
		for (int i = 0; i < len; i++ ) {
			for (int j = 0; j < len; j++) {
				if (arry[i] == 1 && arry[j] == 3 && j > i) {
					for (int z = j+1; z < len; z++ ) {
						if (arry[z] == 1 && i < j && j < z ) {
							result = 0;
							System.out.println("hmmmm " + result);
							return result;
						}
					}
					result = 1;
					System.out.println("Gochasss " + result);
					return result;
				}
				
			}
			
		}
		
		System.out.println("hurray!! " + result);
		return result;
	}
}
