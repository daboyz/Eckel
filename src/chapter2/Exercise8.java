package chapter2;

public class Exercise8 {
	public static void main(String[] args) {
		long l1 = 0x2f; // Hexadecimal (lowercase)
		System.out.println("l1: " + Long.toBinaryString(l1));
		long l2 = 0X2F; // Hexadecimal (uppercase)
		System.out.println("l2: " + Long.toBinaryString(l2));
		long l3 = 0177; // Octal (leading zero)
		System.out.println("l3: " + Long.toBinaryString(l3));
	}
}