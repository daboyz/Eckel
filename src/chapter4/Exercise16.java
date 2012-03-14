package chapter4;
// Exercise 16:  Create an array of String objects and assign a String to each element. Print the array by using a for loop.
public class Exercise16 {
	public static void main(String[] args) {
		String[] a = {"We ", "come ", "in ", "peace"};
		for(String i : a){
			System.out.print(i);
		}
	}
}
