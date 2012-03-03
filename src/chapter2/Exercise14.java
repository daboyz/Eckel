package chapter2;
/* Exercise 14: Write a method that takes two String arguments and uses all the
 * boolean comparisons to compare the two Strings and print the results.
 * For the == and !=, also perform the equals( ) test. 
 * In main( ), call your method with some different String objects.
*/
public class Exercise14 {
	static void Compare(String one, String two){
		System.out.println(one + " = " + two + " is " + (one == two));
		System.out.println(one + " != " + two + " is " + (one != two));
		System.out.println(one + " = " + two + " is " + (one.equals(two)));
		System.out.println(two + " = " + one + " is " + (two.equals(one)));  //Tht's it for the String type, I guess
	}
	public static void main(String[] args){
		String one = "I am a robot", two = "I am not a robot";
		Compare(one, two);
	}
}
