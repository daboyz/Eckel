package chapter10_holding_your_objects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
/* Exercise 18: Fill a HashMap with key-value pairs. Print the results to show ordering by hash code. 
 * Extract the pairs, sort by key, and place the result into a LinkedHashMap. Show that the insertion order is maintained.
 */


class HashMapper{
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	LinkedHashMap<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
	
	public void fillMap(){
		Random rand = new Random(42);
		int k;
		for (int i=0; i<10; i++){
			k = rand.nextInt(i+20);
			map.put(k, Integer.toString(k));
		}
		System.out.println("Hash code order: " + map);
	}
	
	public void remap(){
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> it;
		int temp;
		int smallest;
		int iterations = keyset.size(); 
		for (int i = 0; i < iterations; i++) {
			it = keyset.iterator();
			smallest = it.next();
			it = keyset.iterator();
			while(it.hasNext()) {
				temp = it.next();
				if (temp < smallest) smallest = temp;
			}
			linkedmap.put(smallest, map.get(smallest));
			keyset.remove(smallest);
		}
		System.out.println("Sorted (insertion order): " + linkedmap);
	}
}

public class Exercise18 {
	public static void main(String[] args) {
		HashMapper hm = new HashMapper();
		hm.fillMap();
		hm.remap();
	}
}/* Output:
Hash code order: {0=0, 18=18, 20=20, 25=25, 8=8, 27=27, 10=10, 12=12, 13=13}
Sorted (insertion order): {0=0, 8=8, 10=10, 12=12, 13=13, 18=18, 20=20, 25=25, 27=27}
*/