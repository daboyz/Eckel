package chapter9_inner_classes;
/* Exercise 7: Create a class with a private field and a private method. 
 * Create an inner class with a method that modifies the outer-class field and calls the outer-class method. 
 * In a second outer-class method, create an object of the inner class and call its method, then show the effect on the outer-class object.
 */
class Frame{
	private int i;
	private void put() {
		System.out.println("Frame.put()");
	}
	class Layer{
		void set(){
			i = 5;
			System.out.println(i);
			put();
		}
	}
	public void take(){
		Layer l = new Layer();
		l.set();
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.take();
		//System.out.println(f.i);		//Visibility restriction
		
	}
}/* Output:
5
Frame.put()
*/