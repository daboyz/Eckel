package chapter9_inner_classes;
// Exercise 4: Add a method to the class Sequence.SequenceSelector that produces the reference to the outer class Sequence.

interface Selector1 {
	boolean end();
	Object current();
	void next();
	Sequence1 getSequence1();	//Prototype of new methods
}
class Sequence1 {
	private Object[] items;
	private int next = 0;
	public Sequence1(int size) { items = new Object[size]; }
	public void add(Object x) {
		if(next < items.length)
			items[next++] = x;
	}
	private class SequenceSelector1 implements Selector1 {
		private int i = 0;
		public boolean end() { return i == items.length; }
		public Object current() { return items[i]; }
		public void next() { if(i < items.length) i++; }
		public Sequence1 getSequence1(){		//New method that produces the reference to the EXISTING outer class Sequence1
			return Sequence1.this;	
		}
	}
	public Selector1 selector1() {
		return new SequenceSelector1();
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		Sequence1 seq1 = new Sequence1(1);
		Selector1 sel1 = seq1.selector1();
		sel1.getSequence1();		//Usage
	}
}