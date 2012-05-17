package chapter8_Interfaces;
/* Exercise 14: Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. 
 * Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which
 * takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.
 */
interface Barbarian{
	void kick();
	void punch();
}
interface Warlock{
	void charm();
	void cast();
}
interface WitchHunter{
	void shoot();
	void block();
}
interface GameChar extends Barbarian, Warlock, WitchHunter{
	void run();
}
class User{
	void play() {}
}
class UserChar extends User implements GameChar{
	public void kick() {}
	public void punch() {}
	public void charm() {}
	public void cast() {}
	public void shoot() {}
	public void block() {}
	public void run() {}
}
public class Exercise14 {
	static void barbKick (Barbarian b){
		b.kick();
	}
	static void warlCharm (Warlock w){
		w.charm();
	}
	static void whShoot (WitchHunter wh){
		wh.shoot();
	}
	static void gamechRun (GameChar g){
		g.run();
	}
	public static void main(String[] args) {
		UserChar hero = new UserChar();
		barbKick(hero);
		warlCharm(hero);
		whShoot(hero);
		gamechRun(hero);
	}
}