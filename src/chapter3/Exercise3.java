package chapter3;
import java.util.Random;
/* Exercise 3: Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. 
 * It will then run until you interrupt it from the keyboard (typically by pressing Control-C). 
 */
public class Exercise3 {
	public static String compare(int a, int b){
		if (a>b) return "First integer is greater.";
		else if (a<b) return "Second integer is greater.";
		else return "Holy crap they're equal!";
	}
	public static void main(String[] args){
		Random rand = new Random();
		while (true) { //Infinite loop, yay!
			int a = rand.nextInt(686);
			int b = rand.nextInt(686);
			System.out.println(compare (a,b));
		}
	}
}
