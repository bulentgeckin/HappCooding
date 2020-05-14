package c1.Arrays;

import java.util.Arrays;

public class A03_ObjectArray {

	public static void main(String args[]) {
		
		
		String[] my_arr1= {"Life","is","short","time","is","fast"};
		
		System.out.println("Size of array : "+my_arr1.length);
		System.out.println("Type of array : "+my_arr1.getClass());
		
		String[] my_arr2=my_arr1;  //duplicate the array as new array
		
		System.out.println(Arrays.toString(my_arr2));
		
		for (String x: my_arr1)
			System.out.println(x);
		
		
		
		
		
	}
	
}
