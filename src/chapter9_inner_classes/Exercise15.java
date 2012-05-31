package chapter9_inner_classes;
/* Exercise 15: Create a class with a non-default constructor (one with arguments) and no default constructor (no "no-arg" constructor). 
 * Create a second class that has a method that returns a reference to an object of the first class. 
 * Create the object that you return by making an anonymous inner class that inherits from the first class.
 */
class Throbber{
	int i;
	Throbber(int i){
		this.i = i;
	}
}
class Bobber{
	Throbber getThrobber(int i){
		return new Throbber(i){
		};
	}
}
public class Exercise15 {
	public static void main(String[] args) {
		Bobber b = new Bobber();
		System.out.println(b.getThrobber(5).i);		//Test if i field is passed the parameter
	}
}/* Output:
5
*/