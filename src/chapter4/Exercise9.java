package chapter4;
// Exercise 9: Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
class Drone{
	String s;
	float f;
	int i;
	boolean lol;
	Drone(String s, double f){
		this.s = s;
		this.f = (float)f;
		System.out.println(this.s + this.f);
	}
	Drone(int i, boolean lol){
		this("Hello", 3.14);
		this.i = i; 
		this.lol = lol;
		System.out.println( this.s + this.f + this.i + this.lol);
	}
}
public class Exercise9 {
	public static void main(String[] args){
		new Drone("Warp", 3.15);
		new Drone(4, true);
	}
}
