package chapter7_Polymorphism;
/* Exercise 9: Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class, 
 * provide methods that are common to all Rodents, and override these in the derived classes to perform 
 * different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with 
 * different specific types of Rodents, and call your base-class methods to see what happens.
 */
class Rodent{
	void eat(){
		System.out.println("Rodent.eat()");
	}
	void jump(){
		System.out.println("Rodent.jump()");
	}
	
}
class Mouse extends Rodent {
	void eat(){
		System.out.println("Mouse.eat()");
	}
	void jump(){
		System.out.println("Mouse.jump()");
	}
}
class Gerbil extends Rodent {
	void eat(){
		System.out.println("Gerbil.eat()");
	}
	void jump(){
		System.out.println("Gerbil.jump()");
	}
}
class Hamster extends Rodent {
	void eat(){
		System.out.println("Hamster.eat()");
	}
	void jump(){
		System.out.println("Hamster.jump()");
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		Rodent[] rod = { 		//Creation and population of an array
				new Rodent(),
				new Mouse(),
				new Gerbil(),
				new Hamster()
		};
		for(Rodent i : rod){	//Calling base-class methods
			i.eat();
			i.jump();
		}
	}
}/* Output:
Rodent.eat()
Rodent.jump()
Mouse.eat()
Mouse.jump()
Gerbil.eat()
Gerbil.jump()
Hamster.eat()
Hamster.jump()
*/
