package chapter8_Interfaces;
// Exercise 9: Refactor Music5.java by moving the common methods in Wind, Percussion and Stringed into an abstract class.
import chapter7_Polymorphism.Note;

abstract class Instrument{		//An abstract class to inherit from
	abstract void play(Note n);
	abstract public String toString();	//Had to specify "public" level
	abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Percussion"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Stringed"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}
class Brass extends Wind {
	public String toString() { return "Brass"; }
}
class Woodwind extends Wind {
	public String toString() { return "Woodwind"; }
}
public class Exercise9 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
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
