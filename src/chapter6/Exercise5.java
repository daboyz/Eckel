package chapter6;
/* Exercise 5: Create two classes, A and B, with default constructors (empty argument lists) that announce themselves. 
 * Inherit a new class called C from A, and create a member of class B inside C. 
 * Do not create a constructor for C. Create an object of class C and observe the results.
 */

class A{
	A(){ System.out.println("A"); } //Class A with default constructor (empty argument lists) that announces itself.
}

class B{
	B(){ System.out.println("B"); } //Class B with default constructor (empty argument lists) that announces itself.
}

class C extends A{                  //Inherited a new class called C from A, no constructor.
	B b = new B();                  //Created a member of class B inside C. 
}

public class Exercise5 {
	public static void main(String[] args) {
		C c = new C();	            //Created an object of class C.
	}
} /* Output:                        //Behold the results:
A                                   //An object of C is created. It creates an object of B, but first it calls A constructor. 
B
*///:~
