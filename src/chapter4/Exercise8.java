package chapter4;
/* Exercise 8: Create a class with two methods. Within the first method, call the second method twice: 
 * the first time without using this, and the second time using this—just to see it working; you should not use this form in practice.
 */
class BreakingBad{
	public void blueMeth(){
		System.out.println("Blue Meth");
	}
	public void redMeth(){
		System.out.println("Red Meth");
		blueMeth();
		this.blueMeth();
	}
}
public class Exercise8 {
	public static void main(String[] args){
		BreakingBad cook = new BreakingBad();
		cook.blueMeth();
		cook.redMeth();
	}
}
