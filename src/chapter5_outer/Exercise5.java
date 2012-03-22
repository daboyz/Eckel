package chapter5_outer;
/* Exercise 5: Create a class with public, private, protected, and package-access fields and method members. 
 * Create an object of this class and see what kind of compiler messages you get when you try to access all the class members. 
 * Be aware that classes in the same directory are part of the “default” package.
 */
public class Exercise5 {
	public static void main(String[] args){
		chapter5.Exercise5 ex5 = new chapter5.Exercise5();
		System.out.println(ex5.a);
		//System.out.println(ex5.b); //Private field is not visible
		//System.out.println(ex5.c); //Protected field is not visible
		//System.out.println(ex5.d); //Package field is not visible
		ex5.exerc1();
		//ex5.exerc2(); //Private method is not visible
		//ex5.exerc3(); //Protected method is not visible
		//ex5.exerc4(); //Package method is not visible
	}
}
//Please refer to chapter5.Exercise5