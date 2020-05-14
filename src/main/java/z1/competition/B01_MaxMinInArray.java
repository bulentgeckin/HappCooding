package z1.competition;

import java.util.Arrays;

public class B01_MaxMinInArray {

	public static void main(String[] args) {

		int[] a= {10,3,8,9,4,1,-4,3,14};
		Arrays.sort(a);
		
		System.out.printf("Min number in array : %s%n",a[0]);
		System.out.printf("Max number in array : %s%n",a[a.length-1]);
		
		
	}

}
