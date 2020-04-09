package z.competition;

public class D03_ReverseString_StringBuffer {

	public static void main(String[] args) {

		String str = "Hello World";
		String reversedStr = reverseString(str);
		System.out.println(str);
		System.out.println(reversedStr);
		
	}

	public static String reverseString(String str) {

		StringBuffer newStr = new StringBuffer(str);
		return newStr.reverse().toString();
	}

}
