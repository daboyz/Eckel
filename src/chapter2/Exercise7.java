package chapter2;
import java.util.*;
/** Coin flipper
* @author Anton Shashuk
* @version 1.0
*/
class Coin{
	/** Just a coin with a state of "Heads" or "Tails"
	* @throws exceptions No exceptions thrown
	*/
	String state;
}
class Flipper{        
	static String Flip(Coin c){ 
		/** A class that contains a static method that flips the coin
		* @param argument is the coin itself
		* @throws exceptions No exceptions thrown (duh)
		* @returns a string that is written into the Coin's state; really wanted to play with this :)
		*/
		Boolean flp;   //Just for the sake of usage the logical operators output
		Random rand = new Random();
		int i = rand.nextInt(2);
		flp = (i<1);
		if (flp != true) return "Heads";
		else return "Tails";
	}
}
public class Exercise7 {
	public static void main(String[] args){
		Coin c = new Coin();
		c.state=Flipper.Flip(c); //Yay!
		System.out.println("You have flipped for " + c.state);
	}
}
