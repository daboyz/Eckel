package chapter9_inner_classes;
// Exercise 8: Determine whether an outer class has access to the private elements of its inner class.
class Board{
	class Cupboard{
		private int i;
		private void draw(){
			System.out.println("draw()");
		}
	}
	void wrap(){
		Cupboard c = new Cupboard();
		System.out.println(c.i);
		c.draw();
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		Board b = new Board();
		b.wrap();		//Access granted	
	}
}/* Output:
0
draw()
*/