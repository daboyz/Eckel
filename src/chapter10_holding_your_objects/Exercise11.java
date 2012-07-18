package chapter10_holding_your_objects;
import java.util.*;

/* Exercise 11: Write a method that uses an Iterator to step through a Collection and print the toString( ) of each object in the container. 
 * Fill all the different types of Collections with objects and apply your method to each container.
 */
public class Exercise11 {
	public static Collection populate(Collection<Object> c){
		Random rand = new Random();
		for(int i = 0; i <5; i++)
			c.add(rand.nextInt(9));
		return c;
	}
	public static Map populateMap(Map<Object, Object> c){
		Random rand = new Random();
		for(int i = 0; i <5; i++)
			c.add(rand.nextInt(9), i);
		return c;
	}
	public static void goPrint(Collection<Object> c){
		Iterator<Object> it = c.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");
	}
	public static void main(String[] args){
		goPrint(populate(new ArrayList<Object>()));
		goPrint(populate(new LinkedList<Object>()));
		goPrint(populate(new HashSet<Object>()));
		goPrint(populate(new TreeSet<Object>()));
		goPrint(populate(new LinkedHashSet<Object>()));
		goPrint(populateMap(new HashMap<Object,Object>()));
		goPrint(populateMap(new TreeMap<Object,Object>()));
		goPrint(populateMap(new LinkedHashMap<Object,Object>()));
	}
}
