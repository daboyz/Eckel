package chapter4;
/* Exercise 20: Create a main( ) that uses varargs instead of the ordinary main( ) syntax. 
 * Print all the elements in the resulting args array. Test it with various numbers of command-line arguments.
 */
class Feeder{
	public static void main(String[] args){  //This main should be ran in order to it to pass the array
		Exercise20.main(new String[]{"Wat"});
		Exercise20.main(new String[]{"Wat ", "is ", "yer ", "business ", "here"});
		Exercise20.main(new String[]{});
	}
}
public class Exercise20 {
	public static void main(String... args){
		for(String s : args){
			System.out.print(s);
		}
		System.out.println();
	}
}
