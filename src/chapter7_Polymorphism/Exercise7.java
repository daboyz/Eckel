package chapter7_Polymorphism;
//Exercise 7: Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.

class Choir extends Instrument {
	void play(Note n) { System.out.println("Choir.play() " + n); }
	public String toString() { return "Choir"; }
	void adjust() { System.out.println("Adjusting Choir"); }
}
public class Exercise7 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	public static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void printAll(Instrument[] e) {
		for(Instrument i : e)
			System.out.println(i);
	}
public static void main(String[] args) {
	Instrument[] orchestra = {
			new Choir()    //Upcasting new class
	};
	tuneAll(orchestra);
	printAll(orchestra);                     
	}
} /* Output:
Choir.play() MIDDLE_C
Choir
*/