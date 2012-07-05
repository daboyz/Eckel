package chapter10_holding_your_objects;
// Exercise 5: Modify ListFeatures.java so that it uses Integers (remember autoboxing!) instead of Integers, and explain any difference in results.
import java.util.*;

public class Exercise5 {
	public static List<Integer> IntegersToList(int last) {	//Had to create a method that fills an array with Integers to avoid excessive coding inside main()
		Random rand = new Random(47);
		List<Integer> intlist = new ArrayList<Integer>(); 
		for(int i = 0; i < last; i++)
			intlist.add(rand.nextInt(47)); 		
		return intlist;	
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> Integers = IntegersToList(7);
		System.out.println("1: " + Integers);
		Integer h = 1;
		Integers.add(h); // Automatically resizes
		System.out.println("2: " + Integers);
		System.out.println("3: " + Integers.contains(h));
		Integers.remove(h); // Remove by object
		Integer p = Integers.get(2);
		System.out.println("4: " + p + " " + Integers.indexOf(p));
		Integer cymric = 2;
		System.out.println("5: " + Integers.indexOf(cymric));
		System.out.println("6: " + Integers.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + Integers.remove(p));
		System.out.println("8: " + Integers);
		Integers.add(3, 3); // Insert at an index
		System.out.println("9: " + Integers);
		List<Integer> sub = Integers.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + Integers.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + Integers.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + Integers.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(Integers);
		sub = Arrays.asList(Integers.get(1), Integers.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(Integers); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, 5); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + Integers.isEmpty());
		Integers.clear(); // Remove all elements
		System.out.println("19: " + Integers);
		System.out.println("20: " + Integers.isEmpty());
		Integers.addAll(IntegersToList(4));
		System.out.println("21: " + Integers);
		Object[] o = Integers.toArray();
		System.out.println("22: " + o[3]);
		Integer[] pa = Integers.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);
	}
}/* Output:
1: [8, 21, 5, 6, 21, 39, 33]
2: [8, 21, 5, 6, 21, 39, 33, 1]
3: true
4: 5 2
5: -1
6: false
7: true
8: [8, 21, 6, 21, 39, 33]
9: [8, 21, 6, 3, 21, 39, 33]
subList: [21, 6, 3]
10: true
sorted subList: [3, 6, 21]
11: true
shuffled subList: [6, 3, 21]
12: true
sub: [6, 21]
13: [6, 21, 21]
14: [8, 6, 21, 21, 39, 33]
15: [8, 39, 33]
16: [8, 5, 33]
17: [8, 5, 6, 21, 33]
18: false
19: []
20: true
21: [8, 21, 5, 6]
22: 6
23: 6

Original Output:
1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug]
2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster]
3: true
4: Cymric 2
5: -1
6: false
7: true
8: [Rat, Manx, Mutt, Pug, Cymric, Pug]
9: [Rat, Manx, Mutt, Mouse, Pug, Cymric, Pug]
subList: [Manx, Mutt, Mouse]
10: true
sorted subList: [Manx, Mouse, Mutt]
11: true
shuffled subList: [Mouse, Manx, Mutt]
12: true
sub: [Mouse, Pug]
13: [Mouse, Pug]
14: [Rat, Mouse, Mutt, Pug, Cymric, Pug]
15: [Rat, Mutt, Cymric, Pug]
16: [Rat, Mouse, Cymric, Pug]
17: [Rat, Mouse, Mouse, Pug, Cymric, Pug]
18: false
19: []
20: true
21: [Manx, Cymric, Rat, EgyptianMau]
22: EgyptianMau
23: 14

The difference in output is in type of objects that are inside the Lists
*///:~