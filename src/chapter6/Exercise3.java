package chapter6;
/* Exercise 3: (2) Prove that even if you don’t create a constructor for Cartoon( ), 
 * the compiler will synthesize a default constructor for you that calls the base class constructor.
 */

class Art {
	Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { System.out.println("Drawing constructor"); }
}

class Cartoon extends Drawing {
	//public Cartoon() { System.out.println("Cartoon constructor"); }
	
}

public class Exercise3 {
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
} /* Output:
Art constructor
Drawing constructor
*///:~