package chapter3;
/* Exercise 4:  Write a program that uses two nested for loops and the modulus operator (%) 
 * to detect and print prime numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1)
 */
public class Exercise4 {
	public static void main(String[] args){
		for (int i=1; i<1001; i++){ //Here we scroll integers from 1 to 1000 into the "i" variable
			int k=1, j=2;           // Initialization of modulus and test value at the beginning of each cycle 
			while ((k!=0) && (j<i)){  //I used "while" cycle instead of "for" in order to optimize performance - quit checking if at least one division between 1 and i has zero modulus
				k = i%j;
				j++;
			}
			if (k!=0) System.out.println(i);  
		}
	}
}
