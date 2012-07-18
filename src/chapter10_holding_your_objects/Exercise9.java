package chapter10_holding_your_objects;
//Exercise 9: Modify innerclasses/Sequence.java so that Sequence works with an Iterator instead of a Selector.
import java.util.*;

interface Selector1 {
	boolean end();
	Object current();
	void next();
}
class Sequence1 {
	private List<Object> items;
	public Sequence1() { items = new ArrayList<Object>(); }
	public void add(Object x) {
		items.add(x);
		}
	public Iterator<Object> getIterator(){
		return items.iterator();
	}
}
public class Exercise9 {
	public static void main(String[] args) {
		Sequence1 sequence = new Sequence1();
		for(int i = 0; i < 10; i++)
			sequence.add(i);
		Iterator<Object> selector = sequence.getIterator();
		while(selector.hasNext()) {
			System.out.print(selector.next() + " ");
		}
	}
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~