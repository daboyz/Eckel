package chapter4;
// Exercise 15: Create a class with a String that is initialized using instance initialization.
class Instance{
	String s;
	{
		s = "String initialized";	
		System.out.println(s);
	}
}
public class Exercise15 {
	public static void main(String[] args) {
		new Instance();
	}
}
