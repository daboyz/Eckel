package chapter9_inner_classes;
/* Exercise 23: Create an interface U with three methods. Create a class A with a method that produces a reference to a U by 
 * building an anonymous inner class. Create a second class B that contains an array of U. B should have one method that accepts 
 * and stores a reference to a U in the array, a second method that sets a reference in the array (specified by the method argument) 
 * to null, and a third method that moves through the array and calls the methods in U. In main( ), create a group of A objects 
 * and a single B. Fill the B with U references produced by the A objects. Use the B to call back into all the A objects. Remove some of the U references from the B.
 */
interface U{
	void a();
	void b();
	void c();
}
class A {
	U getU(){
		return new U(){
			public void a(){
				System.out.println("a()");
			};
			public void b(){
				System.out.println("b()");
			};
			public void c(){
				System.out.println("c()");
			};
		};
	}
}
class B{
	U[] uArray = new U[5];
	void setU(U u, int i){
		uArray[i] = u;
	}
	void nullU(int i){
		uArray[i] = null;
	}
	void moveU(U[] u){
		int i = 0;
		while ((i != u.length) && (u[i]!=null)){	//Check for null values
			uArray[i].a();
			uArray[i].b();
			uArray[i].c();
			i++;
		}
	}
}
public class Exercise23 {
	public static void main(String[] args) {
		A[] aArray = new A[5];
		for (int i=0; i<5; i++){	//Create a group of A objects
			aArray[i] = new A();
		}
		B b1 = new B();				//And a single B
		for (int i=0; i<5; i++){
			b1.setU(aArray[i].getU(), i);	//Fill the B with U references produced by the A objects
		}
		b1.moveU(b1.uArray);	//Use the B to call back into all the A objects
		b1.nullU(2);
		b1.nullU(4);			//Remove some of the U references from the B.
	}
}/* Output:
a()
b()
c()
a()
b()
c()
a()
b()
c()
a()
b()
c()
a()
b()
c()
*/