package chapter2;
class Dogg{
	String name, says;
}
public class Exercise5 {
	public static void main (String[] args){
		Dogg spot = new Dogg();
		Dogg scruffy = new Dogg();
		spot.name = "spot"; spot.says = "Ruff!";
		scruffy.name = "spot"; scruffy.says = "Wurf!";		
		System.out.println(spot.name + " says " + spot.says);
		System.out.println(scruffy.name + " says " + scruffy.says);
	}
}
