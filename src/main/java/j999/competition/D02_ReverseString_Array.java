package j999.competition;

public class D02_ReverseString_Array {

	public static void main(String[] args) {

		String str = "Hello World";
		String reversedStr = reverseString(str);
		System.out.print(str + " : " + reversedStr);

	}

	public static String reverseString(String str) {

		String reversedStr = "";
		char[]  charArr=str.toCharArray();
		

		for (int i = str.length() - 1; i >= 0; i--) 
			reversedStr = reversedStr + charArr[i];	
		
		return reversedStr;

	}

}
