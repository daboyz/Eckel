package chapter8_Interfaces;
/* Exercise 4: Create an abstract class with no methods. Derive a class and add a method. 
 * Create a static method that takes a reference to the base class, 
 * downcasts it to the derived class, and calls the method. In main( ), demonstrate that it works. 
 * Now put the abstract declaration for the method in the base class, thus eliminating the need for the downcast.
 */
abstract class Airplane{
	abstract void fly();
}
class F15 extends Airplane{
	void fly(){
		System.out.println("Flying F15");
	}
	public static void crash(){
		Airplane a = new F15();		//Upcasting
		//((F15)a).fly();		//Downcasting required only whe the method fly() is not abstract
		a.fly();	
		System.out.println("Crashing F15");
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		F15.crash();
	}
}/* Output:
Flying F15
Crashing F15
*/