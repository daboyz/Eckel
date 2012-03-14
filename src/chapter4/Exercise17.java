package chapter4;
/* Exercise 17: Create a class with a constructor that takes a String argument. 
 * During construction, print the argument. Create an array of object references
 *  to this class, but don’t actually create objects to assign into the array. 
 * When you run the program, notice whether the initialization messages from the constructor calls are printed. 
 */
class Wake{
	Wake(String s){
		System.out.println(s);
	}
}
public class Exercise17 {
	public static void main(String[] args) {
		Wake[] w  = new Wake[5]; //Of course nothing is printed. What's to print when a default constructor is called?
	}
}