package chapter7_Polymorphism;
// Exercise 1: Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.
class Cycle{
	
}

class Unicycle extends Cycle{
	public String toString(){
	return "Uniycle";	
	}
}

class Bicycle extends Cycle{
	public String toString(){
		return "Bicycle";
	}
}
	
class Tricycle extends Cycle{
	public String toString(){
		return "Tricycle";	
	}
}
	
public class Exercise1 {
	public static void ride(Cycle c){
		System.out.println("Riding a " + c.toString());
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(b);
		ride(t);
	}
}
