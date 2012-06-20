package chapter10_holding_your_objects;
// Exercise 2: Modify SimpleCollection.java to use a Set for c.
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<Integer>();
		for(int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for(int i = 0; i < 10; i++)
			c.add(i); // Let's try to add the same values
		for(Integer i : c)
			System.out.print(i + ", ");
	}
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~