package chapter6;
/* Exercise 23: Prove that class loading takes place only once. Prove that loading may be caused by 
 * either the creation of the first instance of that class or by the access of a static member.
 */
class Loader{
	static int i = printInit("Loader.i init");
	static int printInit(String s){
		System.out.println(s);
		return 1;
	}
	Loader(){
		System.out.println("Loader constructor");
	}
}
class Loader2 extends Loader{
	static int j = printInit("Loader2.j init");
	Loader2(){
		System.out.println("Loader2 constructor");
	}
}
public class Exercise23 {
	public static void main(String[] args) {
		Loader2.j = 1; 				 //Accessing static member calls  
		Loader2 ldr = new Loader2(); //Calling derived class constructor from already loaded classes 
	}
}/* Output:
Loader.i init
Loader2.j init
Loader constructor
Loader2 constructor
*/
