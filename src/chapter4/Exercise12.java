package chapter4;
/* Exercise 12: Create a class called Tank that can be filled and emptied, 
 * and has a termination condition that it must be empty when the object is 
 * cleaned up. Write a finalize( ) that verifies this termination condition. 
 * In main( ), test the possible scenarios that can occur when your Tank is used.
 */
class Tank{
	boolean filled = false;
public void fill(){
		filled = true;
	}
	public void empty(){
		filled = false;
	}
	protected void finalize() {
		if(filled)
		System.out.println("You're throwing away a full tank of nothing!");
		}
}
public class Exercise12 {
	public static void main(String[] args){
		Tank bigtank = new Tank();
		System.out.println("Initial fillness for tank is " + bigtank.filled);
		bigtank.fill();
		System.out.println("Filled fillness is " + bigtank.filled);
		System.gc(); //A full tank is being marked for garbage collection
		new Tank();
		System.out.println("Tank respawn fillness is still " + bigtank.filled);
		bigtank.empty();
		System.out.println("Emptied fillness is " + bigtank.filled);
		System.gc(); //An empty tank is being marked for garbage collection, so no message folks
	}
}