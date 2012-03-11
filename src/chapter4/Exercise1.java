package chapter4;
// Exercise 1: Create a class containing an uninitialized String reference. Demonstrate that this reference is initialized by Java to null.
class Uninit{
	String s;
}
public class Exercise1 {
	public static void main(String[] args){
		Uninit u = new Uninit();
		System.out.println(u.s);
	}
}
