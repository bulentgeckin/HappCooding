package a.pack2;

import a.pack1.Father;

public class Child2_DifferentPackage extends Father {

	public static void main(String[] args) {

		Father obj=new Father();
		//System.out.println(obj.fatherName);  // child 2 is different package can not access parent variable
		//System.out.println(obj.ssnFather); // its private can non accessible out side of class


		System.out.println(obj.getFirstNameOfFather());
		System.out.println(obj.getSsnFather());
		
		

	}

}
