package chapter8_Interfaces;
// Exercise 1: Modify Exercise 9 in the previous chapter so that Rodent is an abstract class. Make the methods of Rodent abstract whenever possible.
abstract class Rodent{
	abstract void eat();
	abstract void jump();
	
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

public class Exercise1 {
	public static void main(String[] args) {
		Rodent[] rod = { 		
			//	new Rodent(),    //Have to outcomment this line because Rodent is an abstract class now
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
Mouse.jump()
Gerbil.eat()
Gerbil.jump()
Hamster.eat()
Hamster.jump()
*/