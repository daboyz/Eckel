package chapter7_Polymorphism;
/* Exercise 12: Modify Exercise 9 so that it demonstrates the order of initialization of the base classes and derived classes. 
 * Now add member objects to both the base and derived classes and show the order in which their initialization occurs during construction.
 */

class Characteristic {
	private String s;
	Characteristic() {
		System.out.println("Creating Characteristic");
	}
}
class Description {
	Description() {
		System.out.println("Creating Description");
	}
}
class Rodentt{
	Characteristic c = new Characteristic();
	Description d = new Description();
	Rodentt (){
		System.out.println("Creating Rodentt");  //Constructors added
	}
}
class Mousee extends Rodentt {
	Characteristic c = new Characteristic();
	Description d = new Description();
	Mousee(){
		System.out.println("Creating Mousee");
	}
}
class Gerbill extends Rodentt {
	Characteristic c = new Characteristic();
	Description d = new Description();
	Gerbill(){
		System.out.println("Creating Gerbill");
	}
}
class Hamsterr extends Rodentt {
	Characteristic c = new Characteristic();
	Description d = new Description();
	Hamsterr(){
		System.out.println("Creating Hamsterr");
	}
}

public class Exercise12 {
	public static void main(String[] args) {
		Rodentt[] rodd = { 		
				new Rodentt(),
				new Mousee(),
				new Gerbill(),
				new Hamsterr()
		};
	}
}/* Output:
Creating Characteristic
Creating Description
Creating Rodentt
Creating Characteristic
Creating Description
Creating Rodentt
Creating Characteristic
Creating Description
Creating Mousee
Creating Characteristic
Creating Description
Creating Rodentt
Creating Characteristic
Creating Description
Creating Gerbill
Creating Characteristic
Creating Description
Creating Rodentt
Creating Characteristic
Creating Description
Creating Hamsterr
*/