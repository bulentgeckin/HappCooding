package j010_Arrays;

import java.util.Arrays;

public class C01_ArrayCopy {

	public static void main(String[] args) {

		Integer[] my_arr= {1,2,3,4,5,6,7,8,9}; 
		System.out.println("my array  : "+Arrays.toString(my_arr));
		
		
		// Option 1
		Integer[] my_arr1=my_arr;
		System.out.println("array_1   : "+Arrays.toString(my_arr1));
		
		// Option 2 with clone method
		Integer[] my_arr2=my_arr.clone();
		System.out.println("array_2   : "+Arrays.toString(my_arr2));
		
		
		
		// Options 3
		Integer[] my_arr3=Arrays.copyOfRange(my_arr, 1, 5);
		System.out.println("array_3   : "+Arrays.toString(my_arr3));
		
		
		//Option 4 is advanced way to make another copy
		//System.arraycopy(source_array,start,destination_array,destination start position, destination end positions)
		Integer[] my_arr4 = new Integer[5];
		
		
		System.arraycopy(my_arr, 1, my_arr4, 0, 5);
		System.out.println("array_4   : "+Arrays.toString(my_arr4));
		
		
		
		
		
		
		
		
		
		
	}

}
