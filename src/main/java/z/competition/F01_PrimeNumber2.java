package z.competition;

public class F01_PrimeNumber2 {

	public static void main(String[] args) {

		for (int i = -2; i < 100000; i++) {
			isPrime(i);
		}
	}

	public static void isPrime(Integer number) {

		Boolean isPrime = true;
		Boolean isNatural = true;

		if (number < 0) {
			//System.out.println(number + " is not natural number");
			isNatural=false;
		} else if (number <=1) {
			isPrime = false;

		} else {

			for (int i = 2; i < number/2; i++) {

				if (number % i == 0) {

					isPrime = false;
					break;
				}
			}
		}
		if (isPrime & isNatural) {
			//System.out.println(number + " is prime");
			System.out.println(number+" ");
		}  else if  (!isPrime) {
			//System.out.println(number + " is not prime");
		}

	}

}
