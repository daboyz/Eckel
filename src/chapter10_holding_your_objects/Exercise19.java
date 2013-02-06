package chapter10_holding_your_objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
//Exercise 19: Repeat the previous exercise with a HashSet and LinkedHashSet.

class HashSetMapper{
	HashSet<Integer> set = new HashSet<Integer>();
	LinkedHashSet<Integer> linkedset = new LinkedHashSet<Integer>();
	
	public void fillSet(){
		Random rand = new Random(42);
		int k;
		for (int i=0; i<10; i++){
			k = rand.nextInt(i+20);
			set.add(k);
		}
		System.out.println("Hash code order: " + set);
	}
	
	public void remapSet(){
		Iterator<Integer> it;
		int temp;
		int smallest;
		int iterations = set.size(); 
		for (int i = 0; i < iterations; i++) {
			it = set.iterator();
			smallest = it.next();
			it = set.iterator();
			while(it.hasNext()) {
				temp = it.next();
				if (temp < smallest) smallest = temp;
			}
			linkedset.add(smallest);
			set.remove(smallest);
		}
		System.out.println("Sorted (insertion order): " + linkedset);
	}
}

public class Exercise19 {
	public static void main(String[] args) {
		HashSetMapper hm = new HashSetMapper();
		hm.fillSet();
		hm.remapSet();
	}
}/* Output:
Hash code order: [0, 18, 20, 25, 8, 27, 10, 12, 13]
Sorted (insertion order): [0, 8, 10, 12, 13, 18, 20, 25, 27]
*/