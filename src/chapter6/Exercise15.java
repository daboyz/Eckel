package chapter6;
/* Exercise 15: Create a class inside a package. Your class should contain a protected method. 
 * Outside of the package, try to call the protected method and explain the results. 
 * Now inherit from your class and call the protected method from inside a method of your derived class.
 */

public class Exercise15 {
	protected void destroy(){
		System.out.println("Destroyed.");
	}
}

class Captain extends Exercise15{
	 Captain(){
		 destroy();  //Method can be called
	 }
}

// Please refer to chapter 5 Exercise15_distant_call