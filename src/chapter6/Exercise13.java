package chapter6;
/* Exercise 13: Create a class with a method that is overloaded three times. 
 * Inherit a new class, add a new overloading of the method, 
 * and show that all four methods are available in the derived class.
 */
class Furniture{
	int i;
	void build(int i){
		System.out.println("build with integer " + i);
	}
	void build(char c){
		System.out.println("build with char " + c);
	}
	void build(float f){
		System.out.println("build with float " + f);
	}
}

public class Exercise13 extends Furniture {
	void build(String ss){
		System.out.println("build with string " + ss);
	}
	public static void main(String[] args) {
		Exercise13 ex13 = new Exercise13();
		ex13.build(4);
		ex13.build('c');
		ex13.build(3.14f);
		ex13.build("Lol");
	}
}/* Output:
build with integer 4
build with char c
build with float 3.14
build with string Lol
*/