package chapter6;
// Exercise 10: Modify the previous exercise so that each class only has non-default constructors.
class Component11{
	Component11(int i){
		System.out.println("Component11"); 
	}
}
class Component12{
	Component12(int i){
		System.out.println("Component12"); 
	}
}
class Component13{
	Component13(int i){
		System.out.println("Component13"); 
	}
}
class Root1{
	Root1(int i){
		System.out.println("Root1");
		Component11 one = new Component11(i);
		Component12 two = new Component12(i);
		Component13 three = new Component13(i);
	}
}
class Stem1 extends Root1{
	Stem1(int i){
		super(i);
		Component11 one1 = new Component11(i);
		Component12 two2 = new Component12(i);
		Component13 three3 = new Component13(i);
	}
}
public class Exercise10 {
	public static void main(String[] args) {
		Stem1 s = new Stem1(5);
	}
}/* Output:
Root1
Component11
Component12
Component13
Component11
Component12
Component13
*///:~
