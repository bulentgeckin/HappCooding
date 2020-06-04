package j010_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class B02_ArraySorting2 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Arrays.sort() doesn't give us reverse order functions
		 * we use Collections.reverseOrder() for reverse order
		 * But, most important part is Collections class does not work with non-primitive data types
		 */
		
		Integer[] my_arr= {6,3,4,7,1};   // 
		System.out.println("my_array        :"+Arrays.toString(my_arr));
		
		// Sort array small to big
		Arrays.sort(my_arr);
		
		System.out.println("sorted          :"+Arrays.toString(my_arr));

		// Reverse sort
		Arrays.sort(my_arr,Collections.reverseOrder());  // if arrays is primitive data type you can not use Collections.reverseOrder()
		System.out.println("reverse order   :"+Arrays.toString(my_arr));
		
		
		

		
		
		
	}

}
