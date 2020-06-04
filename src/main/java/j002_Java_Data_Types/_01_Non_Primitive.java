package j002_Java_Data_Types;

import java.util.Random;

public class _01_Non_Primitive {
	public static void main(String[] args) {

		// String one of the most popular non-primitive data types in Java
		
		String myName="Albert";
		String myLastName="Einstein";
		
		System.out.println("Hello, "+myName+" "+ myLastName);
		
		
		// all Objects are non-primitive data types
		// will be explained next 
		// just for example
		Random obj = new Random();
		int my_int=obj.nextInt(100);
		System.out.println(my_int);
		
		
		
		
		
		
		
		
		

	}
}
