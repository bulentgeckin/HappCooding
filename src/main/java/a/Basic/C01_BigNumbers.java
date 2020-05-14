package a.Basic;

public class C01_BigNumbers {
	public static void main(String[] args) {

		//integer numbers range    -2,147,483,648 to 2,147,483,647  
		
		int a=2147483647;
		System.out.println(a+1);  // :)) out of range,  computer returned to the very beginning number
		
		
		System.out.println("\nLong Numbers");
		
		
		// long number range is 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		long bigNumber=2147483647;
		System.out.println(bigNumber+1);  // right result
		
		
		
	}

}
