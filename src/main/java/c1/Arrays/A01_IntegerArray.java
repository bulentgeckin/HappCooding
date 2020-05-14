package c1.Arrays;

import java.util.Arrays;

public class A01_IntegerArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int b[] = { 4, 5, 6, 7 };
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		a[3]=9;
		System.out.println(a[3]);
		

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}
}
