package chapter10_holding_your_objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/* Exercise 12: Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, 
 * and use ListIterators to read elements from the first List and insert them into the second in reverse order. 
 * (You may want to explore a number of different ways to solve this problem.)
 */
public class Exercise12 {
	
	public static void populate(List<Integer> c){
		Random rand = new Random();
		for(int i = 0; i <5; i++)
			c.add(rand.nextInt(9));
	}	
	
	public static void rePopulate(List<Integer> from, List<Integer> to){
		ListIterator<Integer> liFrom = from.listIterator(from.size());
				while(liFrom.hasPrevious())
					to.add(liFrom.previous());
	}
	
	public static void main(String[] args) {
		
		List<Integer> linteger1 = new ArrayList<Integer>();
		populate(linteger1);
		List<Integer> linteger2 = new ArrayList<Integer>(5);
		
		rePopulate(linteger1, linteger2);
		System.out.println(linteger1);
		System.out.println(linteger2);
	}
}/* Output:
[5, 8, 0, 0, 4]
[4, 0, 0, 8, 5]
*/