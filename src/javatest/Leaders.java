package javatest;
// Write a Java program to print all the LEADERS in the array.   Go to the editor
//Note: An element is leader if it is greater than all the elements to its right side.

public class Leaders {

	public static void main(String[] args) {
		int[] arr = {10, 9, 14, 23, 15, 0, 9};
		findLeaders(arr);
		
	}
	
	static int findLeaders(int[] arr) {
		int result = 0;
		int len = arr.length;
		int leader = arr[len-1];
		
		for (int i = 0; i < len; i++) {
			if (arr[i] > leader) {
				leader = arr[i];
				System.out.println("leader: " + leader);
				break;
			}
		}
		
		return result;
	}

}
