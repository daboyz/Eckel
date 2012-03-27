package chapter6;
/* Exercise 8: Create a base class with only a non-default constructor, 
 * and a derived class with both a default (no-arg) and non-default constructor. 
 * In the derived-class constructors, call the base-class constructor.
 */

class Animal{
	Animal(String s){
		System.out.println("Animal " + s); 
	}
}

class Mouse extends Animal{
	Mouse(){
		super("empty");
	}
	Mouse(String s){
		super(s);
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Mouse n = new Mouse("mouse");
	}
}/* Output:
Animal empty
Animal mouse
*///:~