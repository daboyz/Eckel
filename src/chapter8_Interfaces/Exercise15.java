package chapter8_Interfaces;
// Exercise 15: Modify the previous exercise by creating an abstract class and inheriting that into the derived class.

abstract class OnlineUser{
	void play() {}
}

class OnlineUserChar extends OnlineUser implements GameChar{
	public void kick() {}
	public void punch() {}
	public void charm() {}
	public void cast() {}
	public void shoot() {}
	public void block() {}
	public void run() {}
}

public class Exercise15 {		//Same old
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
		OnlineUserChar hero = new OnlineUserChar();
		barbKick(hero);
		warlCharm(hero);
		whShoot(hero);
		gamechRun(hero);
	}
}