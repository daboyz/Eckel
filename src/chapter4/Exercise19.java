package chapter4;
// Exercise 19: Write a method that takes a vararg String array. Verify that you can pass either a comma-separated list of Strings or a String[] into this method.
public class Exercise19 {
	static void take(String... strg){
		for(String s : strg){
			System.out.print(s);
		}
	}
	public static void main(String[] args) {
		take("We ", "come ", "in ", "peace");
		System.out.println();
		take(new String[]{"They ", "come ", "in ", "peace"});
	}		
}
