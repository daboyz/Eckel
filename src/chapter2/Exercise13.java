package chapter2;
// Exercise 13: Write a method that displays char values in binary form. Demonstrate it using several different characters.
public class Exercise13 {
	public static void main (String[] args){
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		for (char item : characters){
			char c = item;
			c <<= 0;
			System.out.println(Integer.toBinaryString(c));
		}
	}
}
