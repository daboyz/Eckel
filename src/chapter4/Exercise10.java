package chapter4;
// Exercise 10: Create a class with a finalize( ) method that prints a message. In main( ), create an object of your class. Explain the behavior of your program.
class FinalEyes{
	int i=0; //Default value of variable is initialized
	public void errorgate(float f){ //A method that changes default value by it's argument
		i = i + (int)f;
	}
	protected void finalize() { //A garbage collection method that if defined (as here) performs additional tasks (prints "NO U" on condition of default value or equivalence)
		if(i==0)
		System.out.println("NO U");
		}
}
public class Exercise10 {
	public static void main(String[] args){
		 FinalEyes are = new  FinalEyes();
		 are.errorgate((float) 3.14); //Default value is changed
		 System.gc();                 //Marking object for garbage collection is silent
		 new  FinalEyes();            //Variable initialized
		 System.gc();				  //Marking object for garbage collection invokes message
	}
}
