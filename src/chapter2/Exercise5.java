package chapter2;
class Dog{
	String name, says;
}
public class Exercise5 {
	public static void main (String[] args){
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.name = "spot"; spot.says = "Ruff!";
		scruffy.name = "spot"; scruffy.says = "Wurf!";		
		System.out.println(spot.name + " says " + spot.says);
		System.out.println(scruffy.name + " says " + scruffy.says);
	}
}
