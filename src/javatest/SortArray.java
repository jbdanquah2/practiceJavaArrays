package javatest;
import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		int[] my_array1 = {
	            1789, 2035, 1899, 3456, 2013, 
	            1458, 2458, 5254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
	            
	    String[] my_array2 = {
	            "Java",
	            "Python",
	            "PHP",
	            "C#",
	            "iC Programming",
	            "C++"
	        };  
		SortArray sort = new SortArray();
		sort.sortArray(my_array1,my_array2);
	}
	
	public int[] sortArray(int[] arry, String[] arrys) {
	
		Arrays.sort(arry);
		Arrays.sort(arrys);
		
		System.out.println(Arrays.toString(arry));
		System.out.println(Arrays.deepToString(arrys));
		return arry;
	}
	
}
