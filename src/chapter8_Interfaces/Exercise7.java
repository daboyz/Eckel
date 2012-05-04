package chapter8_Interfaces;
// Exercise 7: Change Exercise 9 in the Polymorphism chapter so that Rodent is an interface.

interface Rodent_i{
	void eat();
	void jump();
	
}
class Mouse_i implements Rodent_i {
	public void eat(){
		System.out.println("Mouse_i.eat()");
	}
	public void jump(){
		System.out.println("Mouse_i.jump()");
	}
}
class Gerbil_i implements Rodent_i {
	public void eat(){
		System.out.println("Gerbil_i.eat()");
	}
	public void jump(){
		System.out.println("Gerbil_i.jump()");
	}
}
class Hamster_i implements Rodent_i {
	public void eat(){
		System.out.println("Hamster_i.eat()");
	}
	public void jump(){
		System.out.println("Hamster_i.jump()");
	}
}

public class Exercise7 {
	public static void main(String[] args) {
		Rodent_i[] rod = { 		
			//	new Rodent_i(),    //Have to outcomment this line because Rodent is an interface now
				new Mouse_i(),
				new Gerbil_i(),
				new Hamster_i()
		};
		for(Rodent_i i : rod){	//Calling base-class methods
			i.eat();
			i.jump();
		}
	}
}/* Output:
Mouse_i.jump()
Gerbil_i.eat()
Gerbil_i.jump()
Hamster_i.eat()
Hamster_i.jump()
*/