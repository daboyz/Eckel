package chapter9_inner_classes;
/* Exercise 11: Create a private inner class that implements a public interface. 
 * Write a method that returns a reference to an instance of the private inner class, upcast to the interface. 
 * Show that the inner class is completely hidden by trying to downcast to it.
 */
interface Hero{
	void fly();
}
class Superhero{
	private class Hulk implements Hero{
		public void fly() {}
	}
	Hero getHulk(){
		return new Hulk();
	}
}

public class Exercise11 {
	public static void main(String[] args) {
		Superhero sh = new Superhero();
		//(Hulk)sh.getHulk().fly();	//"Hulk cannot be resolved to a variable" message appears
		sh.getHulk().fly();			//Visibility via public method ok
	}
}