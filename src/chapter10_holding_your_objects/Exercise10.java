package chapter10_holding_your_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//Exercise 10: Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the Rodents and an Iterator to move through the sequence of Rodents.

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
class Gerbil2 extends Rodent {
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

public class Exercise10 {
	public static void main(String[] args) {
		ArrayList<Rodent> rod = new ArrayList<Rodent>();
		rod.add(new Rodent());
		rod.add(new Mouse());
		rod.add(new Gerbil2());
		rod.add(new Hamster());
		Iterator<Rodent> iteRodent = rod.iterator();
		while(iteRodent.hasNext()){	//Calling base-class methods
			Rodent currentRodent = iteRodent.next();
			currentRodent.eat();
			currentRodent.jump();
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