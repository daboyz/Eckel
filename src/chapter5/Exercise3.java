package chapter5;
/* Exercise 3: Create two packages: debug and debugoff, containing an identical class with a debug( ) method. 
 * The first version displays its String argument to the console, the second does nothing. 
 * Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
*/
public class Exercise3 { //I'll create packages "chapter5" and "chapter5_outer" with identical class "Exercise3", how about that?
	public void debug(String s){
		System.out.println(s + " debug ON");
	}
}
// Please refer to chapter5_outer.Exercise3 and chapter5_even_more_outer.Exercise3