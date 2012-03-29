package chapter6;
// Exercise 11: Modify Detergent.java (Excercise2) so that it uses delegation.
  
 class Cleanser1 {
	private String s = "Cleanser1";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
}

class Detergent1{
	public void foam() { append(" foam()"); }
	Cleanser1 cleanser = new Cleanser1();
	public void append(String a){   //Delegated methods block
		cleanser.append(a);
	}
	public void dilute(){
		cleanser.dilute();
	}
	public void apply(){
		cleanser.apply();
	}
	public void scrub(){
		append(" Detergent1.scrub()");
		cleanser.scrub();
	}
	public String toString(){   
		return cleanser.toString();
	}								//End of delegated methods block
} 

public class Exercise11{
	public static void main(String[] args) {
		Detergent1 x = new Detergent1();
		x.dilute();
		x.apply();		
		x.scrub();
		x.foam();
		System.out.println(x);
	}
}
/* Output:
Cleanser1 dilute() apply() Detergent1.scrub() scrub() foam()
*/