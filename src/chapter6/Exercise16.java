package chapter6;
/* Exercise 16: Create a class called Amphibian. From this, inherit a class called Frog. 
 * Put appropriate methods in the base class. In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.
 */
class Amphibian{
	static void jump(Amphibian a){
		System.out.println("Jump!");
	}
	void squeek(){
		System.out.println("Squeek!");
	}
}

class Frog extends Amphibian{
	
}

public class Exercise16 {
	public static void main(String[] args){
		Frog f = new Frog();
		Amphibian.jump(f);  //Upcasting
		f.squeek();
	}
}/* Output:
Jump!
Squeek!
*/