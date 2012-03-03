package chapter2;
/*Exercise 11: Start with a number that has a binary one in the most significant position (hint: Use a hexadecimal constant).
 *  Using the signed right-shift operator, right shift it all the way through all of its binary positions, 
 *  each time displaying the result using Integer.toBinaryString( ).
 */
public class Exercise11 {
	public static void main (String[] args){
		for (int i = 0x1011; i > 0; i >>>= 1){    // I know this is running way ahead, I just couldn't make myself do it without the cycle
			System.out.println(Integer.toBinaryString(i));
		}
	}
}
