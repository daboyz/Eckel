package chapter3;
/* Exercise 8: Create a switch statement that prints a message for each case, 
 * and put the switch inside a for loop that tries each case. 
 * Put a break after each case and test it, then remove the breaks and see what happens.
 */
public class Exercise8 {
	public static void main(String[] args){
		for(int i=0; i<100; i++){
			switch(i){
			case 33 : System.out.println("Thirty three"); // break;
			case 45 : System.out.println("Fourty five"); // break;
			case 75 : System.out.println("Seventy five"); // break;
			case 91 : System.out.println("Ninety one"); // break;
			default : System.out.println("Other");
			}
				 
		}
	}
} 
