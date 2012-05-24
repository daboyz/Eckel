package chapter8_Interfaces;

import java.util.Random;
// Exercise 19: Create a framework using Factory Methods that performs both coin tossing and dice tossing.

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
}
class CoinFactory implements TosserFactory{
	public Tosser getTosser(){
		return new Coin();
	}
}

class Dice implements Tosser{
	public void toss(){
		Random rand = new Random(42);
		System.out.println("Dice tossed for " + (rand.nextInt(5)+1));
	}
}
class DiceFactory implements TosserFactory{
	public Tosser getTosser(){
		return new Dice();
	}
}

public class Exercise19 {
	public static void tossTosser(TosserFactory factory){
		Tosser t = factory.getTosser();
		t.toss();
	}
	public static void main(String[] args) {
		tossTosser(new CoinFactory());
		tossTosser(new DiceFactory());
	}
}/* Output:
Coin tossed for Tails
Dice tossed for 1
*/