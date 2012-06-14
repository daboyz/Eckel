package chapter9_inner_classes;
// Exercise 24: In GreenhouseControls.java, add Event inner classes that turn fans on and off. Configure GreenhouseController.java to use these new Event objects.
import java.util.*;
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
	private List<Event> eventList = new ArrayList<Event>();
	public void addEvent(Event c) { eventList.add(c); }
	public void run() {
		while(eventList.size() > 0)
			for(Event e : new ArrayList<Event>(eventList))
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
			}
	}
}
class GreenhouseControls extends Controller {
		public class Bell extends Event {
			public Bell(long delayTime) { super(delayTime); }
			public void action() {
				addEvent(new Bell(delayTime));
			}
			public String toString() { return "Bing!"; }
		}
		public class Restart extends Event {
			private Event[] eventList;
			public Restart(long delayTime, Event[] eventList) {
				super(delayTime);
				this.eventList = eventList;
				for(Event e : eventList)
					addEvent(e);
				}
			public void action() {
				for(Event e : eventList) {
					e.start(); // Rerun each event
					addEvent(e);
				}
				start(); // Rerun this Event
				addEvent(this);
			}
			public String toString() {
				return "Restarting system";
			}
		}
		public static class Terminate extends Event {
			public Terminate(long delayTime) { super(delayTime); }
			public void action() { System.exit(0); }
			public String toString() { return "Terminating"; }
		}
		//-------------------- Start of Exercise24 code
		private boolean fans = false;
		public class FansOn extends Event {
			public FansOn(long delayTime) { super(delayTime); }
			public void action() {
				// Put hardware control code here to
				// physically turn on the fans.
				fans = true;
			}
			public String toString() { return "Fans are on"; }
		}
		public class FansOff extends Event {
			public FansOff(long delayTime) { super(delayTime); }
			public void action() {
				// Put hardware control code here to
				// physically turn off the fans.
				fans = false;
			}
			public String toString() { return "Fans are off"; }
		}
		//------------------- End of added Fan Control code
}
		
public class Exercise24 {		//Greenhousecontroller analog
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new FansOn(200),			//Adding event that switches fans on
				gc.new FansOff(400),		//Adding event that switches fans off
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if(args.length == 1)
			gc.addEvent(
					new GreenhouseControls.Terminate(
							new Integer(args[0])));
		gc.run();
	}
}