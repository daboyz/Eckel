package chapter4;
// Exercise 7: Create a class without a constructor, and then create an object of that class in main( ) to verify that the default constructor is automatically synthesized.
class Beep{
	String bee = "Beee!";
}
public class Exercise7 {
	public static void main(String[] args){
		Beep b = new Beep();
		System.out.println(b.bee);
	}
}
