package chapter5;
// Exercise 6: Create a class with protected data. Create a second class in the same file with a method that manipulates the protected data in the first class.
class Ghost{
	protected int w=1;
}
public class Exercise6 {
	public static void main(String[] args){
		Ghost gh = new Ghost();
		gh.w=686;
		System.out.println(gh.w);
	}
}