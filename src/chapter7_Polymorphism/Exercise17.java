package chapter7_Polymorphism;
/* Exercise 17: Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle, 
 * but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. 
 * Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.
 */
class Cycles{
	
}

class Unicycles extends Cycles{
	public String toString(){
	return "Unicycles";	
	}
	public void balance(){
		System.out.println("Balancing on " + this);
	}
}

class Bicycles extends Cycles{
	public String toString(){
		return "Bicycles";
	}
	public void balance(){
		System.out.println("Balancing on " + this);
		}
}
	
class Tricycles extends Cycles{
	public String toString(){
		return "Tricycles";	
	}
}
	
public class Exercise17 {
	public static void ride(Cycles c){
		System.out.println("Riding a " + c.toString());
	}
	public static void main(String[] args) {
		Cycles[] c = {
				new Unicycles(), 
				new Bicycles(),
				new Tricycles()
		};
		//c[0].balance();   //Cannot call this method for any element. "The method balance() is undefined for the type Cycles" message appears
		//c[1].balance();
		//c[2].balance();
		((Unicycles)c[0]).balance();
		((Bicycles)c[1]).balance();
		//((Tricycles)c[2]).balance();   //Cannot call this method. "The method balance() is undefined for the type Tricycles" message appears
		//((Bicycles)c[2]).balance();	//This can be compiled but a runtime exception will be thrown "Tricycles cannot be cast to Bicycles"
	}
}/* Output:
Balancing on Unicycles
Balancing on Bicycles
*/