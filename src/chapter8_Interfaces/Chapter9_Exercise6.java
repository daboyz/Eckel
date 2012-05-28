package chapter8_Interfaces;
import chapter8_Interfaces_addendum.Player;

/* Exercise 6: Create an interface with at least one method, in its own package. 
 * Create a class in a separate package. Add a protected inner class that implements the interface. 
 * In a third package, inherit from your class and, inside a method, return an object of the protected inner class, upcasting to the interface during the return.
 * 
 * Please refer to chapter 8 interfaces addendum > player interface 
 * Please refer to chapter 9 inner classes > exercise 6 
 */

public class Chapter9_Exercise6 extends chapter9_inner_classes.Exercise6{
	Player getPPlayer(){
		return new PPlayer();
	}
}
