package chapter9_inner_classes;
// Exercise 9: Create an interface with at least one method, and implement that interface by defining an inner class within a method, which returns a reference to your interface.
interface Hand{
	void facepalm();
}
class Body{
	Hand getHand(){
		class Palm implements Hand{
			public void facepalm(){
				System.out.println("facepalm()");
			}
		}
		return new Palm();
	}
}
public class Exercise9 {
	public static void main(String[] args) {
		Body b = new Body();
		b.getHand().facepalm();
	}
}/* Output:
facepalm()
*/