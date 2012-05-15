package chapter8_Interfaces;
//Exercise 12: In Adventure.java, add an interface called CanClimb, following the form of the other interfaces

interface CanFight {
	void fight();
}
interface CanSwim {
	void swim();
}
interface CanFly {
	void fly();
}
interface CanClimb {	//New interface
	void climb();
}
class ActionCharacter {
	public void fight() {}
}
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {		//Mention the interface here
	public void swim() {}
	public void fly() {}
	public void climb() {}	//Add an implementation
}
class Adventure {
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void r(CanClimb x) { x.climb(); }	//A new method that takes CanClimb as an argument and calls it's method climb()
	public static void w(ActionCharacter x) { x.fight(); }
}

public class Exercise12 {
	public static void main(String[] args) {
		Hero h = new Hero();
		Adventure a = new Adventure();
		a.t(h);
		a.u(h);
		a.v(h); 
		a.w(h); 
		a.r(h);	//Treat it as a CanClimb
	}
}