package chapter6;
/* Exercise 6: Using Chess.java, prove that if you don’t call the base-class constructor in BoardGame( ), 
 * the compiler will complain that it can’t find a constructor of the form Game( ). 
 * In addition, the call to the base-class constructor must be the first thing 
 * you do in the derived-class constructor. (The compiler will remind you if you get it wrong.)
*/
class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		//System.out.println("WAT"); //Uncommenting this line invokes "Constructor call must be the first statement in a constructor" error message.
		super(i);		//Commenting this line invokes "Implicit super constructor Game() is undefined. Must explicitly invoke another constructor" error message.
		System.out.println("BoardGame constructor");
	}
}

class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}
} 

public class Exercise6 {
	public static void main(String[] args) {
		Chess x = new Chess();
		}
}
