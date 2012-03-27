package chapter6;
// Exercise 2: Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).

class Cleanser {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
	
}

class Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}
	// Add methods to the interface:
	public void foam() { append(" foam()"); }
	// Test the new class:
	public static void main(String[] args) {
	Detergent x = new Detergent();
	x.dilute();
	x.apply();
	x.scrub();
	x.foam();
	System.out.println(x);
	System.out.println("Testing base class:");
	Cleanser.main(args);
	} 

} 

public class Exercise2 extends Detergent {
	public void scrub(){
		append(" Exercise2.scrub()");
		super.scrub(); // Call Detergent-class version
	}
	public void sterilize(){ append(" sterilize()"); } //Add new method
	// Test the new class:
	public static void main(String[] args) {
		Exercise2 x = new Exercise2();
		x.dilute();
		x.apply();		
		x.scrub();
		x.foam();
		x.sterilize();
		System.out.println(x);
		System.out.println("Testing base class:");
		Detergent.main(args);
	}
}
