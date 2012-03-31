package chapter6;
// Exercise 18: Create a class with a static final field and a final field and demonstrate the difference between the two.
public class Exercise18 {
	static final int a = 1;
	final int b = 2;
	public static void main(String[] args){
		System.out.println(a);
		//System.out.println(b);   //Does not compile, b does not exist yet
		Exercise18 ex18 = new Exercise18();
		System.out.println(ex18.b);
		//a = a++;				//Does not compile, "a" cannot be assigned
		//ex18.b= ex18.b++;		//Does not compile, "b" cannot be assigned
	}
}
