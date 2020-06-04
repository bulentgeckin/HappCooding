package j002_Java_Data_Types;

public class _00_JavaDataTypes {


		/**
		  
		 https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variablesummary.html
		 https://en.wikibooks.org/wiki/Java_Programming/Primitive_Types
		 https://www.javatpoint.com/java-data-types
		 
		 
		 	Java has two main data types
		 	1 - primitive  
		 	2-  non-primitive (reference types/complex/object etc.)
		 	
		 	
		 	primitive data types
		 	
		 	Numbers	: 
		 			1. byte   	                  -127 | +127
		 			2. short	               -32,768 | +32,768
 		 			3. int		        -2,147,483,648 | +2,147,483,647
		 			4. long -9,223,372,036,854,775,808 | +9,223,372,036,854,775,807
		 			
		 			5. float                  1.4 E-45 | +1.4 E-45 
		 			6. double               4.9 E-324  | 1.797,693,134,862,315,7 E+308
		 			
		 			7. char        'a','b','c' ....
		 			
		 			8. boolean                    True | False
		 			
		*/
		
	public static void main(String[] args) {
		
		byte 	my_byte	=10; 
		short 	my_short=1_000;
		int 	my_int  = 50_000;
		long 	my_long = 90_000_000_000l; // L
		
		float my_float = 3.141592684f; // or F
		double my_double=465465478798718798789798798798798798d; // or d
		
		char my_char='A';
		boolean my_boolean=true;   // or false   // True is not correct
		
		
		
		System.out.println(my_byte);
		System.out.println(my_short);
		System.out.println(my_int);
		System.out.println(my_long);
		System.out.println(my_float);
		System.out.println(my_double);
		System.out.println(my_char);
		System.out.println(my_boolean);
		
		
		
		
		
		
		
		
	}

}
