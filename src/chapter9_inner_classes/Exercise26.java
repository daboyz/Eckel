package chapter9_inner_classes;
/* Exercise 26: Create a class with an inner class that has a non-default constructor (one that takes arguments). 
 * Create a second class with an inner class that inherits from the first inner class.
 */
class BigClass{
	class SmallClass{
		int i;
		SmallClass(int i){
			this.i = i;
		}
	}
}
class BiggerClass{
	class SmallerClass extends BigClass.SmallClass{
		SmallerClass(BigClass bc, int i) {
			bc.super(i);
		}	//Inheritance
	}
}
public class Exercise26 {
	public static void main(String[] args) {
		BigClass bc = new BigClass();
		BiggerClass bgc = new BiggerClass();
		BiggerClass.SmallerClass sc = bgc.new SmallerClass(bc, 5);
		System.out.println(sc.i);
	}

}/* Output:
5
*/