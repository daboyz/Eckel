package chapter10_holding_your_objects;
/* Exercise 4: Create a generator class that produces character names (as String objects) from 
 * your favorite movie (you can use Snow White or Star Wars as a fallback) each time you call next( ), 
 * and loops around to the beginning of the character list when it runs out of names. Use this generator 
 * to fill an array, an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, and a TreeSet, then print each container.
 */
import java.util.*;
class StarWars {
	public static String[] starwars = new String[9];
	public StarWars(){
		starwars[0] = "Luke Skywalker";
		starwars[1] = "Han Solo"; 
		starwars[2] = "Princess Leia Organa"; 
		starwars[3] = "Obi-Wan Kenobi";
		starwars[4] = "C-3PO";
		starwars[5] = "R2-D2";
		starwars[6] = "Chewbacca";
		starwars[7] = "Darth Vader";
		starwars[8] = "Boba Fett";
	}
	
	private static int counter = 0;
	public String next(){
		if (counter == 8) counter = 0; 
		counter++;
		return starwars[counter-1];
	}
	public Collection<String> populateCollection(Collection<String> c, int i){
		for (int z = 0; z <= i; z++){
			c.add(next());
		}
		return c;
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		StarWars episode1 = new StarWars();
		String[] stringarray = new String[11];
		for (int i = 0; i < stringarray.length; i++){		//Array is created and populated in a lousy way
			stringarray[i] = episode1.next();
		}
		for (String s : stringarray){
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println(episode1.populateCollection(new ArrayList<String>(), 10));
		System.out.println(episode1.populateCollection(new LinkedList<String>(), 9));
		System.out.println(episode1.populateCollection(new HashSet<String>(), 8));
		System.out.println(episode1.populateCollection(new LinkedHashSet<String>(), 7));
		System.out.println(episode1.populateCollection(new TreeSet<String>(), 12));
	}
}