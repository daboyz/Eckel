package chapter10_holding_your_objects;
//Exercise 6: Modify ListFeatures.java so that it uses Strings instead of Pets, and explain any difference in results.
import java.util.*;

public class Exercise6 {
	public static List<String> StringsToList(int last) {	//Had to create a method that fills an array with Strings to avoid excessive coding inside main()
		Random rand = new Random(47);
		List<String> strlist = new ArrayList<String>(); 
		for(int i = 0; i < last; i++)
			strlist.add(Integer.toString(rand.nextInt(47))); 		
		return strlist;	
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> Strings = StringsToList(7);
		System.out.println("1: " + Strings);
		String h = "1";
		Strings.add(h); // Automatically resizes
		System.out.println("2: " + Strings);
		System.out.println("3: " + Strings.contains(h));
		Strings.remove(h); // Remove by object
		String p = Strings.get(2);
		System.out.println("4: " + p + " " + Strings.indexOf(p));
		String cymric = "2";
		System.out.println("5: " + Strings.indexOf(cymric));
		System.out.println("6: " + Strings.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + Strings.remove(p));
		System.out.println("8: " + Strings);
		Strings.add(3, "3"); // Insert at an index
		System.out.println("9: " + Strings);
		List<String> sub = Strings.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + Strings.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + Strings.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + Strings.containsAll(sub));
		List<String> copy = new ArrayList<String>(Strings);
		sub = Arrays.asList(Strings.get(1), Strings.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(Strings); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, "5"); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + Strings.isEmpty());
		Strings.clear(); // Remove all elements
		System.out.println("19: " + Strings);
		System.out.println("20: " + Strings.isEmpty());
		Strings.addAll(StringsToList(4));
		System.out.println("21: " + Strings);
		Object[] o = Strings.toArray();
		System.out.println("22: " + o[3]);
		String[] pa = Strings.toArray(new String[0]);
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
sorted subList: [21, 3, 6]
11: true
shuffled subList: [3, 21, 6]
12: true
sub: [3, 21]
13: [3, 21, 21]
14: [8, 3, 6, 21, 39, 33]
15: [8, 6, 39, 33]
16: [8, 5, 39, 33]
17: [8, 5, 3, 21, 39, 33]
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