package chapter7_Polymorphism;
// Exercise 6: Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing the Instrument objects using System.out.println( ) (without any casting).


class Instrument {
	void play(Note n) { System.out.println("Instrument.play() " + n); }
	public String toString() { return "Instrument"; }						//Overriden toString method. Had to make it public because visibility could not be reduced
	void adjust() { System.out.println("Adjusting Instrument"); }
}
class Wind extends Instrument {
	void play(Note n) { System.out.println("Wind.play() " + n); }
	public String toString() { return "Wind"; }
	void adjust() { System.out.println("Adjusting Wind"); }
}
class Percussion extends Instrument {
	void play(Note n) { System.out.println("Percussion.play() " + n); }
	public String toString() { return "Percussion"; }
	void adjust() { System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instrument {
	void play(Note n) { System.out.println("Stringed.play() " + n); }
	public String toString() { return "Stringed"; }
	void adjust() { System.out.println("Adjusting Stringed"); }
}
class Brass extends Wind {
	void play(Note n) { System.out.println("Brass.play() " + n); }
	public String toString() { return "Brass"; }
	void adjust() { System.out.println("Adjusting Brass"); }
}
class Woodwind extends Wind {
	void play(Note n) { System.out.println("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
}
public class Exercise6 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void printAll(Instrument[] e) { //New method for printing
		for(Instrument i : e)
			System.out.println(i);
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
	printAll(orchestra);                      //Print all the instruments in orchestra
	}
} 