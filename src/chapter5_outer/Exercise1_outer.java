package chapter5_outer;
// Exercise 1: Create a class in a package. Create an instance of your class outside of that package.
import chapter5.*;
public class Exercise1_outer {  //Had to name this class differently for the sake of exercising :)
	public static void main(String[] args){ 
		Exercise1 ex1 = new Exercise1();
		System.out.println("Resistance isn't that futile!");
	}
}

