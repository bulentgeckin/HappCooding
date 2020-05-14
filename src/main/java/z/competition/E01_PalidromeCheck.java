package z.competition;

public class E01_PalidromeCheck {

	public static void main(String[] args) {

		reverseString("Anna");
		reverseString("Mike");
		reverseString("Madam");
		reverseString("Mam");
		
		
		
	}

	public static void reverseString(String str) {

		
		
		StringBuffer newStr = new StringBuffer(str.toLowerCase());
		newStr = newStr.reverse();
		System.out.print(str+" : "+newStr);
		
		
		if (str.toLowerCase().contentEquals(newStr))
			System.out.println(" : This word is palidrome");
		else
			System.out.println(" : This word is not palidrome");

	}

}
