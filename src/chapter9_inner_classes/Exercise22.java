package chapter9_inner_classes;
//Exercise 22: Implement reverseSelector( ) in Sequence.java.

interface Selector2 {
	boolean end();
	Object current();
	void next();
}
class Sequence2 {
	private Object[] items;
	private int next = 0;
	public Sequence2(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class ReverseSequenceSelector implements Selector2 {	//Reverse selector
		private int i = items.length - 1;
		public boolean end() { return i == -1; }
		public Object current() { return items[i]; }
		public void next() { if (!end()) i--; }
	}
	public Selector2 reverseSelector() {
		return new ReverseSequenceSelector();
	}
}

public class Exercise22 {
	public static void main(String[] args) {
		Sequence2 sequence = new Sequence2(10);
		for(int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector2 selector = sequence.reverseSelector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}/* Output:
9 8 7 6 5 4 3 2 1 0 
*/

