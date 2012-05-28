package chapter9_inner_classes;
import chapter8_Interfaces_addendum.Player;	//Import required

/* Exercise 6: Create an interface with at least one method, in its own package. 
 * Create a class in a separate package. Add a protected inner class that implements the interface. 
 * In a third package, inherit from your class and, inside a method, return an object of the protected inner class, upcasting to the interface during the return.
 * 
 * Please refer to chapter 8 interfaces addendum > player interface 
 * Please refer to chapter 8 interfaces > "chapter 9 exercise 6" class
 */

public class Exercise6 {
	protected class PPlayer implements Player{	//A protected inner class that implements the interface
		public PPlayer(){}	//A public constructor has to be defined in order to access from another package
		public void play() {
			System.out.println("Player play()");			
		}
	}
}
