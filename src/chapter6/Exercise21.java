package chapter6;
// Exercise 21: Create a class with a final method. Inherit from that class and attempt to overwrite that method.
class Motor{
	final void spin(){
		System.out.println("Spinning!");
	}
}
public class Exercise21 extends Motor{
	//void spin() {}				// "Cannot override the final method from Motor" message appears
}
