package b.JavaInterface;

public class Main {

	public static void main(String[] args) {

		Animal myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		myPig.move();
		myPig.eat();

	}

}

//Interface
interface Animal {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)

	// implemented method inside of interfaceClass
	public default void move() {
		System.out.println("All animals move");
	}

	// implemented method inside of interfaceClass
	public default  void eat() {
		System.out.println("All animals need food");
	}

}

// Pig "implements" the Animal interface
class Pig implements Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Pigs sleep");
	}

	// method overloaded
	public void move() {
		// The body of sleep() is provided here
		System.out.println("Pigs runs very slowly");
	}

}
