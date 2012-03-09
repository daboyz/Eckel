package chapter2;
/* Exercise 10: (3) Write a program with two constant values, one with alternating binary ones and zeroes, 
 * with a zero in the least-significant digit, and the second, also alternating, 
 * with a one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for this). 
 * Take these two values and combine them in all possible ways using the bitwise operators, and display the results using Integer.toBinaryString( ).
 */
public class Exercise10 {
	public static void main(String[] args) {
		System.out.println("AND: " + Integer.toBinaryString(0x1010 & 0x0101));
		System.out.println("OR: " + Integer.toBinaryString(0x1010 | 0x0101));
		System.out.println("XOR: " + Integer.toBinaryString(0x1010 ^ 0x0101));
		System.out.println("NOT: " + Integer.toBinaryString(~ 0x0101));
	}
}/* Actual output is:
AND: 0
OR: 1000100010001
XOR: 1000100010001
NOT: 11111111111111111111111011111110

But why the long numbers?
*///:~