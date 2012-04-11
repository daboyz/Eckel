package chapter7_Polymorphism;
/* Exercise 10: Create a base class with two methods. In the first method, call the second method. 
 * Inherit a class and override the second method. Create an object of the derived class, 
 * upcast it to the base type, and call the first method. Explain what happens.
 */
class PreExercise10{
	void first(){
		System.out.println("first() calls second()");
		this.second();
	}
	void second(){
		System.out.println("second()");
	}
	
}

public class Exercise10 extends PreExercise10 {
	void second(){
		System.out.println("derived.second()");
	}
	public static void main(String[] args){
		PreExercise10 ex10 = new Exercise10();   //Upcasting
		ex10.first();							//An unoverriden method is called (the one from base class). it call the second() method, which is overriden in the derived class.
	}
}/* Output:
first() calls second()
derived.second()
*/