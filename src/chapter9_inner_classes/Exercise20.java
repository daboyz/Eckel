package chapter9_inner_classes;
//Exercise 20: Create an interface containing a nested class. Implement this interface and create an instance of the nested class.
interface Set1{
	static class Unsettled {
		void unsettle(){
			System.out.println("Unsettled!");
		}
	}
}
public class Exercise20 implements Set1{
	public static void main(String[] args) {
		Unsettled u = new Unsettled();
		u.unsettle();
	}
}/*
Unsettled!
*/