package chapter6;
// Exercise 12: Add a proper hierarchy of dispose( ) methods to all the classes in Exercise 9.

class Component1x{
	Component1x(){
		System.out.println("Component1x"); 
	}
	void dispose(){
		System.out.println("Component1x.dispose()");
	}
}
 class Component2x{
	Component2x(){
		System.out.println("Component2x"); 
	}
	void dispose(){
		System.out.println("Component2x.dispose()");
	}
}
class Component3x{
	Component3x(){
		System.out.println("Component3x"); 
	}
	void dispose(){
		System.out.println("Component3x.dispose()");
	}
}
class Rootx{
	private Component1x one;
	private Component2x two;
	private Component3x three;
	Rootx(){
		System.out.println("Rootx");
		one = new Component1x();
		two = new Component2x();
		three = new Component3x();
	}
	void dispose(){
		System.out.println("Rootx.dispose()");
		three.dispose();
		two.dispose();
		one.dispose();
	}
}class Stemx extends Rootx{
	private Component1x one1;
	private Component2x two2;
	private Component3x three3;
	public Stemx(){
		one1 = new Component1x();
		two2 = new Component2x();
		three3 = new Component3x();
	}
	public void dispose(){
		System.out.println("Stemx.dispose()");
		three3.dispose();
		two2.dispose();
		one1.dispose();
		super.dispose();
	}
}
public class Exercise12 {
	public static void main(String[] args) {
		Stemx s = new Stemx();
		try {
			//nothing
		}
		finally{
		s.dispose();	
		}
	}
}/* Output:
Rootx
Component1x
Component2x
Component3x
Component1x
Component2x
Component3x
Stemx.dispose()
Component3x.dispose()
Component2x.dispose()
Component1x.dispose()
Rootx.dispose()
Component3x.dispose()
Component2x.dispose()
Component1x.dispose()
*///:~