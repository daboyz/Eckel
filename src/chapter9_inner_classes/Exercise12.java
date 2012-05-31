package chapter9_inner_classes;

/* Exercise 12: Repeat Exercise 7 using an anonymous inner class.
 * 
 * Exercise 7: Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method. 
 * In a second outer-class method, create an object of the inner class and call its method, then show the effect on the outer-class object.
 */
interface Slayer{
	void set();
}

class Mage{
	private int i;
	private void put() {
		System.out.println("Mage.put()");
	}
	public Slayer slayer(){
		return new Slayer(){
			public void set(){
				System.out.println(i);
				i = 5;
				System.out.println(i);
				put();
			}
		};
	}
}

public class Exercise12 {
	public static void main(String[] args) {
		Mage m = new Mage();
		m.slayer().set();		
	}
}/* Output:
0
5
Mage.put()
*/