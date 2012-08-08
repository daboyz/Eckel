package chapter10_holding_your_objects;

import java.util.*;

/*Exercise 13: In the innerclasses/GreenhouseController.java example, the class Controller uses an ArrayList. 
 * Change the code to use a LinkedList instead, and use an Iterator to cycle through the set of events.
 */

abstract class Event {
	private long eventTime;
	protected final long delayTime;

	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}

	public void start() { // Allows restarting
		eventTime = System.nanoTime() + delayTime;
	}

	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}

	public abstract void action();
}

class Controller {

	private List<Event> eventList = new LinkedList<Event>();

	public void addEvent(Event c) {
		eventList.add(c);
	}

	public void run() {
		
				//Changes only here
		LinkedList<Event> events = new LinkedList<Event>(eventList);
			ListIterator<Event> eventIt = events.listIterator();
			while(eventIt.hasNext()) {	
				Event e = eventIt.next();
				e.action();	
				System.out.println(e);		
			}
	}
}


public class Exercise13 {

}

