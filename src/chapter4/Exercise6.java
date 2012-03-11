package chapter4;
/* Exercise 6: Modify the previous exercise so that two of the overloaded methods have two arguments 
 * (of two different types), but in reversed order relative to each other. Verify that this works.
 */
class Dawg{
	Dawg(float a, int b){
		System.out.println("Dog laughs dramatically " + a + " times and then assumes it is a rock " + b + " times");
	}
	Dawg(int a, float b){
		System.out.println("Dog increases enthropy " + a + " times and then lurks beneath " + b + " times");
	}
}
public class Exercise6 {
	public static void main(String[] args){
		Dawg a = new Dawg((float) 4, (int) 4);
		Dawg b = new Dawg((int) 5, (float) 5);
	}
}
