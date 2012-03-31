package chapter6;
/* Exercise 17: Modify Exercise 16 so that Frog overrides the method definitions 
 * from the base class (provides new definitions using the same method signatures). Note what happens in main( ). 
 */
class Amphibian2{
	static void jump(Amphibian2 a){
		System.out.println("Jump!");
	}
	void squeek(){
		System.out.println("Squeek!");
	}
}

class Frog2 extends Amphibian2{
	static void jump(Amphibian2 a){
		System.out.println("Frog jump!");
	}
	void squeek(){
		System.out.println("Frog squeek!");
	}
}

public class Exercise17 {
	public static void main(String[] args){
		Frog2 f = new Frog2();
		Amphibian2.jump(f);  //Upcasting uses method from base class
		f.jump(f);       //Derived class method
		f.squeek();      //Derived class method
	}
}/* Output:
Jump!
Frog jump!
Frog squeek!
*/