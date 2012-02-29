package chapter2;

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