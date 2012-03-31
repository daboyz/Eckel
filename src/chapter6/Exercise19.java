package chapter6;
/* Exercise 19: Create a class with a blank final reference to an object. 
 * Perform the initialization of the blank final inside all constructors. 
 * Demonstrate the guarantee that the final must be initialized before use, and that it cannot be changed once initialized.
 */
class Cog{
	Cog(){
		System.out.println("Cog");
	}
}
class Blank{
	final Cog cogg;
	Blank(){
		cogg = new Cog();
		System.out.println("Blank1");
	}
	Blank(String s){
		cogg = new Cog();
		System.out.println("Blank2 " + s);
	}
}
public class Exercise19 {
	public static void main(String[] args){
		Blank blaank = new Blank();
		Blank blaaank = new Blank("WUT");
		//blaank.cogg = new Cog();			//Does not compile. "The final field Blank.cogg cannot be assigned" message appears
		//blaaank.cogg = new Cog();			//Does not compile. "The final field Blank.cogg cannot be assigned" message appears
	}
}
