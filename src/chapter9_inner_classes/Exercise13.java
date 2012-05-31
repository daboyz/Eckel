package chapter9_inner_classes;
/* Exercise 13: (1) Repeat Exercise 9 using an anonymous inner class.
 * 
 * Exercise 9: Create an interface with at least one method, and implement that interface by defining an inner class within a method, which returns a reference to your interface.
*/
interface Head{
	void facepalm();
}

class Chest{
	Head getHead(){
		return new Head(){
			public void facepalm(){
				System.out.println("facepalm()");
			}
		};
	}
}
public class Exercise13 {
	public static void main(String[] args) {
		Chest ch = new Chest();
		ch.getHead().facepalm();
	}
}/* Output:
facepalm()
*/