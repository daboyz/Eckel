package chapter8_Interfaces;
// Exercise 17: Prove that the fields in an interface are implicitly static and final.

interface Scoreboard{
	int	ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5;
}

public class Exercise17 implements Scoreboard{
	public static void main(String[] args) {
		System.out.println(ONE + " " + TWO);  //No need for creating an object
	//ONE = 5;	//"The final field Scoreboard.ONE cannot be assigned" message appears
	}
}/* Output:
1 2
*/