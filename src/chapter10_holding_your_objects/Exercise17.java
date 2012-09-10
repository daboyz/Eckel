package chapter10_holding_your_objects;
/* Exercise 17: Take the Gerbil class in Exercise 1 and put it into a Map instead, associating each Gerbil’s name 
 * (e.g. "Fuzzy" or "Spot") as a String (the key) for each Gerbil (the value) you put in the table. 
 * Get an Iterator for the keySet( ) and use it to move through the Map, looking up the Gerbil 
 * for each key and printing out the key and telling the Gerbil to hop( ).
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import chapter10_holding_your_objects.Gerbil;

class GerbilMapper{
	Map<String, Gerbil> gerbilmap = new HashMap<String, Gerbil>();
	public void mapGerbils(){
		for (int i=0; i<5; i++){
			gerbilmap.put(Integer.toString(i), new Gerbil());
		}
	}
	
	public void makeGerbilsHop(){
		Set<String> gerbilkeyset = gerbilmap.keySet();
		Iterator<String> gerbilit = gerbilkeyset.iterator();
		while(gerbilit.hasNext()) {	
				gerbilmap.get(gerbilit.next()).hop();
		}
	}
}

public class Exercise17 {
	public static void main(String[] args){
		GerbilMapper gm = new GerbilMapper();
		gm.mapGerbils();
		gm.makeGerbilsHop();
	}
}/* Output:
Gerbil #4 is hopping!
Gerbil #3 is hopping!
Gerbil #2 is hopping!
Gerbil #1 is hopping!
Gerbil #5 is hopping!
*/
