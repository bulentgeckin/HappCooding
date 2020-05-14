package z1.competition;

public class D01_ReverseString_charAt {

	public static void main(String[] args) {

		String str = "Hello World";
		String reversedStr = reverseString(str);
		System.out.print(str + " : " + reversedStr);

	}

	public static String reverseString(String str) {

		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) 
			reversedStr = reversedStr + str.charAt(i);	
		
		return reversedStr;

	}

}
