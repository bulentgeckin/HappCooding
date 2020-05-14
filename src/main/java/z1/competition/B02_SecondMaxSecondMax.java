package z1.competition;

import java.util.Arrays;

public class B02_SecondMaxSecondMax {

	public static void main(String[] args) {

		int[] a = { 10, 9, 8, 1, 2, 3, 4, 11 };

		int min = a[0];
		int minSecond = a[0];
		int max = a[0];
		int maxSecond = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > maxSecond) {
				maxSecond = a[i];

				if (maxSecond > max) {
					maxSecond = max;
					max = a[i];
				}
			}

			if (a[i] < minSecond) {
				minSecond = a[i];

				if (minSecond < min) {
					minSecond = min;
					min = a[i];
				}

			}

		}

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Min number in array :" + min);
		System.out.println("Second min number in array :" + minSecond);
		System.out.println("Max number in array :" + max);
		System.out.println("Second Max number in array :" + maxSecond);
	}

}
