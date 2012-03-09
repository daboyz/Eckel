package chapter3;
import java.util.*;
/* Exercise 2: Write a program that generates 25 random int values. 
 * For each value, use an if-else statement to classify it as greater than, 
 * less than, or equal to a second randomly generated value.
 */
public class Exercise2 {
	public static String compare(int a, int b){
		if (a>b) return "First integer is greater.";
		else if (a<b) return "Second integer is greater.";
		else return "Holy crap they're equal!";
	}
	public static void main(String[] args){
		Random rand = new Random();
		for (int i=1; i<25; i++){
			int a = rand.nextInt(686);
			int b = rand.nextInt(686);
			System.out.println(compare (a,b));
		}
	}
}
