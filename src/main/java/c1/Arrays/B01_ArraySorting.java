package c1.Arrays;

import java.util.Arrays;

public class B01_ArraySorting {

	public static void main(String[] args) {
		
		
		int[] my_arr= {6,3,4,7,1}; 
		System.out.println("my_array        :"+Arrays.toString(my_arr));
		
		// Sort array small to big
		Arrays.sort(my_arr);
		
		System.out.println("sorted          :"+Arrays.toString(my_arr));

	}

}
