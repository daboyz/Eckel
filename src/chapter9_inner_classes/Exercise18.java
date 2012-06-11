package chapter9_inner_classes;
// Exercise 18: Create a class containing a nested class. In main( ), create an instance of the nested class.
public class Exercise18 {
	static class Nest{	}
	public static Nest getNest(){
		return new Nest();
	}
	public static void main(String[] args) {
		Nest n = getNest();
		Nest p = new Nest();
	}
}