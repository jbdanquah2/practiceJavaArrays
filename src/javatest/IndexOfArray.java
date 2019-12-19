package javatest;

public class IndexOfArray {

	public static void main(String[] args) {
		int[] arry = {2,3,4,2,5};
		IndexOfArray ia = new IndexOfArray();
		ia.findIndex(arry, 2);
	}
	
	public int findIndex(int[] arry, int el) {
		int index = 0;
		int len = arry.length;
		for (int i = 0; i < len; i++) {
			if (arry[i] == el) {
				index = i;
			}
		}
		System.out.println(index);
		return index;
	}
}
