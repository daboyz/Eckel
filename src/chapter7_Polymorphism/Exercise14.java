package chapter7_Polymorphism;
//Exercise 14: Modify Exercise 12 so that one of the member objects is a shared object with reference counting, and demonstrate that it works properly.

class Characteristicc {
	private static long counter = 0;	//A very nice way to contain an overall count
	private final long id = counter++; //Contains a count in each reference
	private String s;
	Characteristicc() {
		System.out.println("Creating " + this);
	}
	public String toString() { return "Characteristicc " + id; }
}
class Descriptionn {
	Descriptionn() {
		System.out.println("Creating Description");
	}
}
class Rodenttt{
	Characteristicc c = new Characteristicc();
	Descriptionn d = new Descriptionn();
	Rodenttt (){
		System.out.println("Creating Rodentt");
	}
}
class Mouseee extends Rodenttt {
	Characteristicc c = new Characteristicc();
	Descriptionn d = new Descriptionn();
	Mouseee(){
		System.out.println("Creating Mousee");
	}
}
class Gerbilll extends Rodenttt {
	Characteristicc c = new Characteristicc();
	Descriptionn d = new Descriptionn();
	Gerbilll(){
		System.out.println("Creating Gerbill");
	}
}
class Hamsterrr extends Rodenttt {
	Characteristicc c = new Characteristicc();
	Descriptionn d = new Descriptionn();
	Hamsterrr(){
		System.out.println("Creating Hamsterr");
	}
}
public class Exercise14 {
	public static void main(String[] args) {
		Rodenttt[] rodd = { 		
				new Rodenttt(),
				new Mouseee(),
				new Gerbilll(),
				new Hamsterrr()
		};
	}
}/* Output:
Creating Characteristicc 0
Creating Description
Creating Rodentt
Creating Characteristicc 1
Creating Description
Creating Rodentt
Creating Characteristicc 2
Creating Description
Creating Mousee
Creating Characteristicc 3
Creating Description
Creating Rodentt
Creating Characteristicc 4
Creating Description
Creating Gerbill
Creating Characteristicc 5
Creating Description
Creating Rodentt
Creating Characteristicc 6
Creating Description
Creating Hamsterr
*/