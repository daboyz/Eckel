package chapter6;
/* Exercise 9: Create a class called Root that contains an instance of each 
 * of the classes (that you also create) named Component1, Component2, and Component3. 
 * Derive a class Stem from Root that also contains an instance of each “component.” 
 * All classes should have default constructors that print a message about that class.
 */
class Component1{
	Component1(){
		System.out.println("Component1"); 
	}
}
class Component2{
	Component2(){
		System.out.println("Component2"); 
	}
}
class Component3{
	Component3(){
		System.out.println("Component3"); 
	}
}
class Root{
	Root(){
		System.out.println("Root");
		Component1 one = new Component1();
		Component2 two = new Component2();
		Component3 three = new Component3();
	}
}
class Stem extends Root{
	Stem(){
		Component1 one1 = new Component1();
		Component2 two2 = new Component2();
		Component3 three3 = new Component3();
	}
}
public class Exercise9 {
	public static void main(String[] args) {
		Stem s = new Stem();
	}
}/* Output:
Root
Component1
Component2
Component3
Component1
Component2
Component3
*///:~