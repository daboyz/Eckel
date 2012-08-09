package chapter10_holding_your_objects;

import java.util.LinkedList;
import java.util.ListIterator;

// Exercise 14: Create an empty LinkedList<Integer>. Using a Listlterator, add Integers to the List by always inserting them in the middle of the List.

class IntoTheMiddle{
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	
	public void insert(Integer i){
			ListIterator<Integer> listiterator = list.listIterator();
			int c = 0;
			while (listiterator.hasNext()){
				listiterator.next();
				c++;
			}
			list.add((c/2+(c%2)), i);
			System.out.println("Inserting " + c);
		}
}

public class Exercise14 {

	public static void main(String[] args) {
		IntoTheMiddle itm = new IntoTheMiddle();
		for (int i = 0; i < 5; i++){
			itm.insert(i);
			System.out.println("The list is now: " + itm.list);
		}
	}
}/* Output:
Inserting 0
The list is now: [0]
Inserting 1
The list is now: [0, 1]
Inserting 2
The list is now: [0, 2, 1]
Inserting 3
The list is now: [0, 2, 3, 1]
Inserting 4
The list is now: [0, 2, 4, 3, 1]
*/
