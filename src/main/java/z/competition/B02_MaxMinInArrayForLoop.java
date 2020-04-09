package z.competition;

public class B02_MaxMinInArrayForLoop {

	public static void main(String[] args) {

		int[] a = { 10, 3, 8, 9, 4, 1, -4, 3, 14 };

		int min = a[0];
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) min = a[i];
			
			if (a[i] > max) max = a[i];

		}

		System.out.println("Min number in array :"+min);
		System.out.println("Max number in array :"+max);
	}

}
