package chapter3;
/* Exercise 5: Repeat Exercise 10 from the previous chapter, using the ternary operator 
 * and a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
 */

public class Exercise5 {
	public static String intToBinStr(int a) {
		String result = ""; int b = a; //In order to preserve "a" value
		do {
			if (b%2==1) result = "1" + result;
			else result = "0" + result;
			b >>>= 1;            //Unsigned shift is used in case "a" is negative
		} while (b!=0);          //The do-while is used for zero integers to be converted as well
		return result;
	}
	
	public static void main(String[] args){
		System.out.println("AND: " + intToBinStr(0x1010 & 0x0101));
		System.out.println("OR: " + intToBinStr(0x1010 | 0x0101));
		System.out.println("XOR: " + intToBinStr(0x1010 ^ 0x0101));
		System.out.println("NOT: " + intToBinStr(~ 0x0101));
	}
	
}
