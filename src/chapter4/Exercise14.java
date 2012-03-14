package chapter4;
/* Exercise 14:  Create a class with a static String field that is initialized 
 * at the point of definition, and another one that is initialized by the static block. 
 * Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
 */
class Town{
	static String streets = "a lot";
	static String avenues;
	static{
		avenues = "even moar";
	}
	static void plan(){
		System.out.println("There are " + Town.streets + " of streets and " + Town.avenues + " avenues in town");
	}
}
public class Exercise14 {
	public static void main(String[] args) {
		Town.plan(); //Well, the Town.streets and Town.avenues variables must be initialized before they are used. It definitely cannot happen after :)
	}
}
