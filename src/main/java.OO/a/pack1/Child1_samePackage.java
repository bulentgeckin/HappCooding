package a.pack1;

public class Child1_samePackage extends Father {

	public static void main(String[] args) {

		Father obj=new Father();
		System.out.println(obj.fatherName);
		//System.out.println(obj.ssnFather); // its private can non accessible out side of class

	}

}
