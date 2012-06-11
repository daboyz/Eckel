package chapter9_inner_classes;
// Exercise 17: Modify the solution to Exercise 19 from the Interfaces chapter to use anonymous inner classes.
import java.util.Random;

interface Tosser{
	void toss();
}
interface TosserFactory{
	Tosser getTosser();
}

class Coin implements Tosser{
	public void toss(){
		Random rand = new Random(42);
		if (rand.nextInt(1)==1)
		System.out.println("Coin tossed for Heads");
		else System.out.println("Coin tossed for Tails");
	}
	public static TosserFactory factory =
			new TosserFactory(){
		public Tosser getTosser(){
			return new Coin();
		}
	};
}

class Dice implements Tosser{
	public void toss(){
		Random rand = new Random(42);
		System.out.println("Dice tossed for " + (rand.nextInt(5)+1));
	}
	public static TosserFactory factory =
			new TosserFactory(){
		public Tosser getTosser(){
			return new Dice();
		}
	};
}

public class Exercise17 {
	public static void tossTosser(TosserFactory factory){
		Tosser t = factory.getTosser();
		t.toss();
	}
	public static void main(String[] args) {
		tossTosser(Coin.factory);
		tossTosser(Dice.factory);
	}
}/* Output:
Coin tossed for Tails
Dice tossed for 1
*/