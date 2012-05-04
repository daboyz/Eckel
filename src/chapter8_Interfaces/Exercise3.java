package chapter8_Interfaces;
/* Exercise 3: Create a base class with an abstract print( ) method that is overridden in a derived class. 
 * The overridden version of the method prints the value of an int variable defined in the derived class. 
 * At the point of definition of this variable, give it a nonzero value. In the base-class constructor, call this method. 
 * In main( ), create an object of the derived type, and then call its print( ) method. Explain the results.
 */
abstract class Printer{
	abstract void print();
}
class Epson extends Printer{
	int i = 5;
	void print(){
		System.out.println(i);
	}
	Epson(){
		print();
	}
}
public class Exercise3 {
	public static void main(String[] args) {
		Epson eps = new Epson();
		eps.print();
	}
}/* Output:
5			//This value is printed when a print() method is called by the constructor
5			//his value is printed when a print() method is called from main()
*/
