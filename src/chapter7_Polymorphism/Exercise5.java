package chapter7_Polymorphism;
// Exercise 5: Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.

class Cyclee{
	public int wheels(Cyclee c){
		if (c.toString() == "Unicycle") return 1;
		else if (c.toString() == "Bicycle") return 2;
		else if (c.toString() == "Tricycle") return 3;
		else return 0;
	}
}


class Unicyclee extends Cyclee{
	public String toString(){
	return "Unicycle";	
	}
}

class Bicyclee extends Cyclee{
	public String toString(){
		return "Bicycle";
	}
}
	
class Tricyclee extends Cyclee{
	public String toString(){
		return "Tricycle";	
	}
}
	
public class Exercise5 {
	public static void ride(Cyclee c){
		System.out.println("Riding a " + c.toString() + " with " + c.wheels(c) + " wheel(s)");
	}
	public static void main(String[] args) {
		Unicyclee u = new Unicyclee();
		Bicyclee b = new Bicyclee();
		Tricyclee t = new Tricyclee();
		ride(u);
		ride(b);
		ride(t);
	}
}/* Output:
Riding a Unicycle with 1 wheels
Riding a Bicycle with 2 wheels
Riding a Tricycle with 3 wheels
*/