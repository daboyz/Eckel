package chapter8_Interfaces;
/* Exercise 10: Modify Musics.java by adding a Playable interface. Move the play( ) declaration from Instrument to Playable. 
 * Add Playable to the derived classes by including it in the implement's list. Change tune( ) so that it takes a Playable instead of an Instrument.
 */
import chapter7_Polymorphism.Note;

interface Playable{
	abstract void play(Note n);
}

abstract class Instrumentt{		//An abstract class to inherit from
	abstract public String toString();	//Had to specify "public" level
	abstract void adjust();
}

class Windd extends Instrumentt implements Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Percussionn extends Instrumentt implements Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Percussion"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Stringedd extends Instrumentt implements Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Stringed"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Brasss extends Windd {
	public String toString() { return "Brass"; }
}
class Woodwindd extends Windd {
	public String toString() { return "Woodwind"; }
}
public class Exercise10 {
	static void tune(Playable i) {		//Accepts Playable now
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Playable[] e) {
		for(Playable i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Playable[] orchestra = {
				new Windd(),
				new Percussionn(),
				new Stringedd(),
				new Brasss(),
				new Woodwindd()
		};
		tuneAll(orchestra);
	}
} /* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*/
