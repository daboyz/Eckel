package chapter4;
/* Exercise 2: Create a class with a String field that is initialized at the point of definition,
 * and another one that is initialized by the constructor. What is the difference between the two approaches?
 */
class TwoStrings{
	String s, d;
	TwoStrings(String a){
	d = a;
	}
}
public class Exercise2 {
	public static void main(String[] args){
		TwoStrings u = new TwoStrings("Wat");
		System.out.println(u.s);
		System.out.println(u.d);
	}
}
// What does it mean - "what is the difference"? It's obvious!