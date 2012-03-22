package chapter5;
/* Exercise 5: Create a class with public, private, protected, and package-access fields and method members. 
 * Create an object of this class and see what kind of compiler messages you get when you try to access all the class members. 
 * Be aware that classes in the same directory are part of the “default” package.
 */
public class Exercise5 {
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=4;
	public void exerc1(){
		System.out.println("God bless the public.");
	}
	private void exerc2(){
		System.out.println("God bless the private.");
	}
	protected void exerc3(){
		System.out.println("God bless the protected.");
	}
	void exerc4(){
		System.out.println("God bless the package.");
	}
}
// Please refer to chapter5_outer.Exercise5