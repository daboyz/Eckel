package chapter7_Polymorphism;
//Exercise 11: Add class Pickle to Sandwich.java.

class Meal {
	Meal() { System.out.println("Meal()"); }
}

class Bread {
	Bread() { System.out.println("Bread()"); }
}
class Cheese {
	Cheese() { System.out.println("Cheese()"); }
}
class Lettuce {
	Lettuce() { System.out.println("Lettuce()"); }
}
class Pickle {
	Pickle() { System.out.println("Pickle()"); }  //New class pickle
}
class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); }
}
class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()");}
}

class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();		//Picle constructor call
	public Sandwich() { System.out.println("Sandwich()"); }
} 

public class Exercise11 {
	public static void main(String[] args){
		new Sandwich();
	}
}/* Output:
Meal()
Lunch()
PortableLunch()
Bread()
Cheese()
Lettuce()
Pickle()
Sandwich()
*/