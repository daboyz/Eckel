package chapter3;
/* Exercise 9: A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
 *  and so on, where each number (from the third on) is the sum of the previous two. 
 *  Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from the beginning,
 *  e.g., if you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 */
public class Exercise9 {
	public static void fibonacci(int c){
		int i1=1, i2=1;
		while (c>0){
			System.out.print(i1 + " ");
			i1 = i1 + i2;
			c--;
			if (c==0) break;
			System.out.print(i2 + " ");
			i2 = i2 + i1;
			c--;            // no need for "c" check here
		}
	}
	public static void main(String[] args){
		fibonacci(10);
	}
}