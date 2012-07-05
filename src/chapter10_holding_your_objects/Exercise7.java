package chapter10_holding_your_objects;
/* Exercise 7: Create a class, then make an initialized array of objects of your class. 
* Fill a List from your array. Create a subset of your List by using subList( ), then remove this subset from your List.
*/
import java.util.*;

class Jug {
	public static int i = 1;
	int num;
	Jug(){
		num = i;
		System.out.println("Created Jug #" + i++);
	}
	public String toString(){
		return "Jug #" + num;
	}
}
public class Exercise7 {
	public static void main(String[] args) {
		Jug[] jugarray = new Jug[5];
		for(int i=0; i<5; i++)
			jugarray[i] = new Jug();
		List<Jug> juglist = Arrays.asList(jugarray);
		System.out.println("Full list: " + juglist);
		List<Jug> sub = juglist.subList(2, 5);
		System.out.println("Sublist: " + sub);
		//juglist.removeAll(sub);	//Throws exception
		List<Jug> copy = new ArrayList<Jug>(juglist);
		copy.removeAll(sub);
		juglist = copy;
		System.out.println("Result: " + juglist);
	}

}/* Output:
Created Jug #1
Created Jug #2
Created Jug #3
Created Jug #4
Created Jug #5
Full list: [Jug #1, Jug #2, Jug #3, Jug #4, Jug #5]
Sublist: [Jug #3, Jug #4, Jug #5]
Result: [Jug #1, Jug #2]
*/