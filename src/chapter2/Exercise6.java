package chapter2;
class Dog{
	String name, says;
}
public class Exercise6 {
	public static void main (String[] args){
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		spot.name = "spot"; spot.says = "Ruff!";
		scruffy.name = "spot"; scruffy.says = "Wurf!";		
		Dog fido = new Dog();
		fido = spot;
		System.out.println(spot==scruffy); //Ok, this is false.
		System.out.println(spot==fido);   //But why is this true?
		System.out.println(fido==scruffy);
		System.out.println(spot.equals(scruffy));
		System.out.println(spot.equals(fido)); // Same here - why is the result true?
		System.out.println(fido.equals(scruffy));
	}
}
