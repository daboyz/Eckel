package chapter4;
// Exercise 4: Add an overloaded constructor to the previous exercise that takes a String argument and prints it along with your message.
class Warp2{
	Warp2(){
		System.out.println("Hello");
	}
	Warp2(String s){
		System.out.println("Hello " + s);
	}
}
public class Exercise4 {
	public static void main(String[] args){
		Warp2 p = new Warp2();
		Warp2 q = new Warp2("World");
	}
}
