package chapter2;
/* Exercise 12: Start with a number that is all binary ones. 
 * Left shift it, then use the unsigned right-shift operator to right shift through 
 * all of its binary positions, each time displaying the result using Integer.toBinaryString( ).
 */
public class Exercise12 {
	public static void main (String[] args){
		int c = 0x11111;
		System.out.println(Integer.toBinaryString(c));
		c <<= 1;
		for (int i = c; i > 0; i >>>= 1){
			System.out.println(Integer.toBinaryString(i));
		}
	}
}
