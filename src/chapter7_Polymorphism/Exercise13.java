package chapter7_Polymorphism;
// Exercise 13: Add a finalize( ) method to ReferenceCounting.java to verify the termination condition (see the Initialization & Cleanup chapter).

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		System.out.println("Creating " + this);
	}
	public void addRef() { refcount++; }
	protected void dispose() {
		if(--refcount == 0)
			System.out.println("Disposing " + this);
	}
	protected void finalize() {
		System.out.println("Trying to finalize " + this);
		if (--refcount != 0)
			System.out.println("Cannot finalize " + this);
		else System.out.println("Successfully finalized " + this);
	}
	public String toString() { return "Shared " + id; }
}
class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		System.out.println("Disposing " + this);
		shared.dispose();
	}
	protected void finalize() { 
		System.out.println("Trying to finalize " + this + " which includes " + shared);		// Finalizing Composing
		shared.finalize();								//Calling finalize() for Shared class
	}
	public String toString() { return "Composing " + id; }
}
public class Exercise13 {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared),
				new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for(Composing c : composing){
			c.dispose();
			c.finalize();
			}
	}
} /* Output:
Creating Shared 0
Creating Composing 0
Creating Composing 1
Creating Composing 2
Creating Composing 3
Creating Composing 4
Disposing Composing 0
Trying to finalize Composing 0 which includes Shared 0
Trying to finalize Shared 0
Cannot finalize Shared 0
Disposing Composing 1
Trying to finalize Composing 1 which includes Shared 0
Trying to finalize Shared 0
Cannot finalize Shared 0
Disposing Composing 2
Disposing Shared 0
Trying to finalize Composing 2 which includes Shared 0
Trying to finalize Shared 0
Cannot finalize Shared 0
Disposing Composing 3
Trying to finalize Composing 3 which includes Shared 0
Trying to finalize Shared 0
Cannot finalize Shared 0
Disposing Composing 4
Trying to finalize Composing 4 which includes Shared 0
Trying to finalize Shared 0
Cannot finalize Shared 0
*/