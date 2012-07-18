package chapter10_holding_your_objects;

import java.util.ArrayList;
import java.util.Iterator;

// Exercise 8: Modify Exercise l so it uses an Iterator to move through the List while calling hop( ).
class Gerbil1{
	public static int counter = 1;
	public final int gerbilNumber;
	public Gerbil1(){
		gerbilNumber = counter++;
	}
	void hop(){
		System.out.println("Gerbil #" + gerbilNumber + " is hopping!");
	}
}

public class Exercise8 {
	public static void main(String[] args) {
		ArrayList<Gerbil1> gerbilList = new ArrayList<Gerbil1>();
		for (int i=0; i<5; i++){
			gerbilList.add(new Gerbil1());
		}
		Iterator<Gerbil1> gerbit = gerbilList.iterator();	//Iterator creation
		while (gerbit.hasNext()){
			gerbit.next().hop();	
		}
	}
}/* Output:
Gerbil #1 is hopping!
Gerbil #2 is hopping!
Gerbil #3 is hopping!
Gerbil #4 is hopping!
Gerbil #5 is hopping!
*/