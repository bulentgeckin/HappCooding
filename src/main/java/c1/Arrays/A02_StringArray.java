package c1.Arrays;

import java.util.Arrays;

public class A02_StringArray {

	public static void main(String args[]) {
		
		
		Object[] my_arr1= {10,'A',true,"String"};
		
		System.out.println("Size of array : "+my_arr1.length);
		System.out.println("Type of array : "+my_arr1.getClass());
		
		Object[] my_arr2=my_arr1;  //duplicate the array as new array
		
		System.out.println(Arrays.toString(my_arr2));
		
		for (Object x: my_arr1)
			System.out.println(x);
		
		
		
		
		
	}
	
}
