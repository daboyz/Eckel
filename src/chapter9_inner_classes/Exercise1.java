package chapter9_inner_classes;
/* Exercise 1: Write a class named Outer that contains an inner class named Inner. 
 * Add a method to Outer that returns an object of type Inner. In main( ), create and initialize a reference to an Inner.
 */
class Outer{
	class Inner{
		Inner(){
			System.out.println("Inner class created");
		}
	}
	public Inner getInner(){
		return new Inner();
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getInner();
		Outer.Inner i = outer.getInner();	//Alternate usage
	}
}/* Output:
Inner class created
Inner class created
*/