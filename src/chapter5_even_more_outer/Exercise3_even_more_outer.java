package chapter5_even_more_outer;
/* Exercise 3: Create two packages: debug and debugoff, containing an identical class with a debug( ) method. 
 * The first version displays its String argument to the console, the second does nothing. 
 * Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect.
*/
import chapter5.*;       //Debug message on
//import chapter5_outer.*; //Debug message off
public class Exercise3_even_more_outer { //Please refer to chapter5.Exercise3 and chapter5_outer.Exercise3
	public static void main(String[] args){
		Exercise3 ex3 = new Exercise3();
		ex3.debug("LOL");
	}
}