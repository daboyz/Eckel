package chapter6;
// Exercise 4: Prove that the base-class constructors are (a) always called and (b) called before derived-class constructors.

class Zork {
	Zork() { System.out.println("Zork constructor"); }
}

class Gork extends Zork {
	Gork() { System.out.println("Gork constructor"); }
}

class Mork extends Gork {
	Mork() {
		System.out.println("Mork constructor"); 
		Zork z = new Zork();
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		Mork x = new Mork();
	}
} /* Output:
Zork constructor
Gork constructor
Mork constructor
Zork constructor	First base-class constructors are called, then again a Zork constructor.
*///:~