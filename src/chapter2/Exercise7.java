package chapter2;
import java.util.Random;

class Coin{
	Boolean state; // Just a coin with a state of true or false
}
class Flipper{        //Method  
	void Flip(Coin c){
		Random rand = new Random(47);
		int i = rand.nextInt(1000);
		if (i<501) c.state = true;
			else c.state = false;
	}
}
public class Exercise7 {
	public static void main(String[] args){
		Coin c = new Coin();
		Flipper f = new Flipper();
		f.Flip(c);
		if (c.state = true) System.out.println("It's heads!");
		else System.out.println("It's tails"); // I know 
	}
}
